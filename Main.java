// package bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Show Balance");
            System.out.println("6. Show Transactions");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    String savAccNo = sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String savName = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double savBalance = sc.nextDouble();

                    bank.addAccount(new SavingsAccount(savAccNo, savName, savBalance));
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String curAccNo = sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String curName = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double curBalance = sc.nextDouble();

                    bank.addAccount(new CurrentAccount(curAccNo, curName, curBalance));
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    Account accDeposit = bank.getAccount(sc.nextLine());
                    if (accDeposit != null) {
                        System.out.print("Enter amount: ");
                        accDeposit.deposit(sc.nextDouble());
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    Account accWithdraw = bank.getAccount(sc.nextLine());
                    if (accWithdraw != null) {
                        System.out.print("Enter amount: ");
                        accWithdraw.withdraw(sc.nextDouble());
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    Account accBalance = bank.getAccount(sc.nextLine());
                    if (accBalance != null) {
                        accBalance.showBalance();
                    }
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    Account accTrans = bank.getAccount(sc.nextLine());
                    if (accTrans != null) {
                        accTrans.showTransactions();
                    }
                    break;

                case 7:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
        }
    }
}








// Resume Line You Can Use

// Developed a console-based Bank Management System using Core Java implementing OOP principles including inheritance, polymorphism, abstraction, and encapsulation; supported multiple account types, transaction history, and balance validation.
