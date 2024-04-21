package Task3;

public class Main {
    public static void main(String[] args) {
        // Initialize a bank account with an initial balance of Rs.1000
        BankAccount bankAccount = new BankAccount(1000);

        // Create an ATM instance with the user's bank account
        ATM atm = new ATM(bankAccount);

        // Start the ATM interface
        atm.start();
    }
}
