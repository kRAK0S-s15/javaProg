public class Lab2 {
    public static void main(String[] args) {
        System.out.println("=== Running Lab2 ===\n");

        Task1MarsWeightKhraneka.run();
        System.out.println("\n---------------------------------\n");

        Task2EvenOrOddKhraneka.run();
        System.out.println("\n-------------------------------\n");

        Task3LegoContainersKhraneka.run();
        System.out.println("\n------------------------------\n");

        Task4TaxCalculationKhraneka.run();

    }

    // TASK 1
    static class Task1MarsWeightKhraneka {
        static float earthWeightKhraneka = 75.43f;
        static float gravityMarsRatioKhraneka = 3.8f;

        static float marsWeightFloatKhraneka;
        static double marsWeightDoubleKhraneka;
        static int marsWeightIntKhraneka;
        static char marsWeightCharKhraneka;
        static int charMathResultKhraneka;

        static void run() {
            System.out.println("=== Running Task1MarsWeightKhraneka ===\n");

            marsWeightFloatKhraneka = earthWeightKhraneka *  gravityMarsRatioKhraneka;
            System.out.println("[1] Mars weight float: " + marsWeightFloatKhraneka + " H");

            marsWeightDoubleKhraneka = marsWeightFloatKhraneka;
            System.out.printf("[2] Mars weight double, 4 dp: %.4f H%n", marsWeightDoubleKhraneka);

            marsWeightIntKhraneka = (int) marsWeightDoubleKhraneka;
            System.out.println("[3] Cast double -> int: " + marsWeightIntKhraneka + " H");

            marsWeightCharKhraneka = (char) marsWeightIntKhraneka;
            System.out.println("[4] Cast int -> char: '" + marsWeightCharKhraneka
                    + "' (code "  + (int) marsWeightCharKhraneka + ")");

            charMathResultKhraneka = (marsWeightCharKhraneka + 3) * 2;
            System.out.println("[5] ((char + 3) * 2) -> int: " + charMathResultKhraneka + " which is '"
                    + (char) charMathResultKhraneka + "'");

        }
    }

    // TASK 2
    static class Task2EvenOrOddKhraneka {

        static int randomNumberKhraneka;
        static boolean isEvenKhraneka;

        static void run() {
            System.out.println("=== Running Task2MarsWeightKhraneka ===\n");

            randomNumberKhraneka = (int) (Math.random() * 100) + 1;
            System.out.println("[1] Generated random number (1–100): " + randomNumberKhraneka);

            isEvenKhraneka = (randomNumberKhraneka % 2 == 0);
            System.out.println("[2] Modulo check: " + randomNumberKhraneka + " % 2 == 0 ? " + isEvenKhraneka);

            if (isEvenKhraneka) {
                System.out.println("[3] Result: " + randomNumberKhraneka + " is EVEN.");
            }
            else {
                System.out.println("[3] Result: " + randomNumberKhraneka + " is ODD.");
            }
        }
    }

    // TASK 3
    static class Task3LegoContainersKhraneka {
        static int amountOfBricksKhraneka = 60;
        static int containerCapacityKhraneka = 7;

        static int fullContainersKhraneka;
        static int remainderBlocksKhraneka;
        static int totalContainersKhraneka;

        static void run() {
            System.out.println("=== Running Task3LegoContainersKhraneka ===\n");

            System.out.println("[1] Input:");
            System.out.println("    - Bricks (odd 50–100): " + amountOfBricksKhraneka);
            System.out.println("    - Capacity (even 5–10): " + containerCapacityKhraneka);

            fullContainersKhraneka = amountOfBricksKhraneka / containerCapacityKhraneka;
            System.out.println("[2] Full containers (int division): " +
                    amountOfBricksKhraneka + " / " + containerCapacityKhraneka + " = " + fullContainersKhraneka);

            remainderBlocksKhraneka = amountOfBricksKhraneka % containerCapacityKhraneka;
            System.out.println("[3] Remainder (modulo): " +
                    amountOfBricksKhraneka + " % " + containerCapacityKhraneka + " = " + remainderBlocksKhraneka);

            totalContainersKhraneka = (amountOfBricksKhraneka + containerCapacityKhraneka - 1) / containerCapacityKhraneka;
            System.out.println("[4] Total containers in general : " + totalContainersKhraneka);

            if (remainderBlocksKhraneka > 0) {
                System.out.println("[5] The last container is NOT full and contains " +
                        remainderBlocksKhraneka + " brick(s).");
            } else {
                System.out.println("[5] All containers are full; no partial container.");
            }

        }
    }

    // TASK 4
    static class Task4TaxCalculationKhraneka {

        static double netPriceDoubleKhraneka = 9.99;
        static double vatRateDoubleKhraneka = 0.23;
        static int quantityKhraneka = 10_000;

        static java.math.BigDecimal netPriceBDKhraneka = new java.math.BigDecimal("9.99");
        static java.math.BigDecimal vatRateBDKhraneka = new java.math.BigDecimal("0.23");
        static java.math.BigDecimal oneBDKhraneka = java.math.BigDecimal.ONE;

        static void run() {
            System.out.println("=== Running Task4TaxCalculationKhraneka ===\n");

            // --- Part A: using double
            double grossPerUnitDoubleKhraneka = netPriceDoubleKhraneka * (1.0 + vatRateDoubleKhraneka);
            System.out.printf("[A1] Gross per unit (double): %.15f%n", grossPerUnitDoubleKhraneka);

            double totalGrossDoubleKhraneka = grossPerUnitDoubleKhraneka * quantityKhraneka;
            System.out.printf("[A2] Total gross (double): %.15f%n", totalGrossDoubleKhraneka);

            double backToNetDoubleKhraneka = totalGrossDoubleKhraneka / (1.0 + vatRateDoubleKhraneka);
            System.out.printf("[A3] Back to net from total gross (double): %.15f%n", backToNetDoubleKhraneka);

            double expectedNetTotalDouble = netPriceDoubleKhraneka * quantityKhraneka;
            double driftDouble = backToNetDoubleKhraneka - expectedNetTotalDouble;
            System.out.printf("[A4] Drift vs expected net total (double): %.15f%n", driftDouble);

            java.math.BigDecimal wrongBDFromDouble =
                    new java.math.BigDecimal(netPriceDoubleKhraneka);
            System.out.println("[A5] BigDecimal from double 9.99 -> " + wrongBDFromDouble +
                    "   (shows binary approximation)\n");

            // --- Part B: using Big Decimal class
            java.math.BigDecimal grossPerUnitBDKhraneka =
                    netPriceBDKhraneka.multiply(oneBDKhraneka.add(vatRateBDKhraneka));
            System.out.println("[B1] Gross per unit (BigDecimal, full precision): " + grossPerUnitBDKhraneka);

            java.math.BigDecimal totalGrossBDKhraneka =
                    grossPerUnitBDKhraneka.multiply(java.math.BigDecimal.valueOf(quantityKhraneka));
            System.out.println("[B2] Total gross (BigDecimal, full precision): " + totalGrossBDKhraneka);

            java.math.BigDecimal backToNetBDKhraneka =
                    totalGrossBDKhraneka.divide(oneBDKhraneka.add(vatRateBDKhraneka));
            System.out.println("[B3] Back to net from total gross (BigDecimal): " + backToNetBDKhraneka);

            java.math.BigDecimal grossPerUnitRounded2Khraneka =
                    grossPerUnitBDKhraneka.setScale(2, java.math.RoundingMode.HALF_UP);
            System.out.println("[B4] Gross per unit rounded to 2 dp: " + grossPerUnitRounded2Khraneka);

            java.math.BigDecimal totalGrossRoundAtEndKhraneka =
                    totalGrossBDKhraneka.setScale(2, java.math.RoundingMode.HALF_UP);
            System.out.println("[B5] Total gross (round at END to 2 dp): " + totalGrossRoundAtEndKhraneka);

            java.math.BigDecimal totalGrossRoundPerItemKhraneka =
                    grossPerUnitRounded2Khraneka.multiply(java.math.BigDecimal.valueOf(quantityKhraneka));
            System.out.println("[B6] Total gross (round PER ITEM to 2 dp): " + totalGrossRoundPerItemKhraneka);

            java.math.BigDecimal diffTotals =
                    totalGrossRoundPerItemKhraneka.subtract(totalGrossRoundAtEndKhraneka);
            System.out.println("[B7] Difference between strategies: " + diffTotals + " (PLN)");

            java.math.BigDecimal expectedNetTotalBDKhraneka =
                    netPriceBDKhraneka.multiply(java.math.BigDecimal.valueOf(quantityKhraneka));
            System.out.println("[B8] Expected net total (BigDecimal): " + expectedNetTotalBDKhraneka);
            System.out.println("[B9] Back-to-net equals expected? " +
                    (backToNetBDKhraneka.compareTo(expectedNetTotalBDKhraneka) == 0));

            System.out.println("\n=== CONCLUSIONS ===");
            System.out.println("1) double shows tiny rounding errors (binary floating point), which drift in totals");
            System.out.println("2) BigDecimal (constructed from STRING or valueOf) preserves exact decimal values");
            System.out.println("3) Rounding strategy matters: per-item rounding vs round-at-end can change totals");
            System.out.println("4) NEVER use new BigDecimal([double format])" +
                    " Use new BigDecimal(\"9.99\")");

        }
    }
}