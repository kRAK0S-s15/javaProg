public class Lab9_3 {

    static class NotEnoughMoneyException extends Exception {
        public NotEnoughMoneyException(String message) {
            super(message);
        }
    }

    static class Account {
        private String owner;
        private int balance;
        private String accountNumber;

        public Account(String owner, int balance, String accountNumber) {
            this.owner = owner;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void transfer(int amount) throws NotEnoughMoneyException {
            if (amount > balance) {
                throw new NotEnoughMoneyException("Not enough money on the account.");
            }
            balance -= amount;
            System.out.println("Transfer completed.");
        }
    }

    public static void main(String[] args) {


        int accTransfer = 1500;
        Account account = new Account("Till Lindemann", 1000, "992178");


        try {
            account.transfer(accTransfer);

        } catch (NotEnoughMoneyException e) {
            System.out.println("Exception caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Other exception caught.");

        } finally {
            System.out.println("Current account balance: " + account.getBalance());
            System.out.println("Current account number: " + account.getAccountNumber());
            System.out.println("Account owner: " + account.getOwner());
            System.out.println("Please, add funds: " + (accTransfer - account.getBalance()));
        }
    }
}