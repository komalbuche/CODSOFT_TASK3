package Task3;

import java.util.Scanner;

class ATM {
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    // Method to start the ATM interface
    public void start() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Method to check the account balance
    private void checkBalance() {
        double balance = bankAccount.getBalance();
        System.out.println("Your current balance is: Rs." + balance);
    }

    // Method to deposit an amount into the account
    private void deposit() {
        System.out.print("Enter the amount to deposit: Rs.");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    // Method to withdraw an amount from the account
    private void withdraw() {
        System.out.print("Enter the amount to withdraw: Rs.");
        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }
}

