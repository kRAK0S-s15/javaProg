import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab10_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first three digits of bank account: ");
        String bankCode = scanner.nextLine().trim();

        String urlString = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

        BufferedReader reader = null;

        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            String line;
            boolean bankFound = false;

            while ((line = reader.readLine()) != null) {

                if (line.startsWith(bankCode)) {

                    String abbreviatedBankNumber = line.substring(0, 4);
                    String bankName = line.substring(6).trim();

                    System.out.println("Bank number: " + abbreviatedBankNumber);
                    System.out.println("Bank name: " + bankName);

                    bankFound = true;
                    break;
                }
            }

            if (!bankFound) {
                System.out.println("Bank not found for given code.");
            }

        } catch (IOException e) {
            System.out.println("Error while reading data: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing stream.");
            }
        }
    }
}
