package org.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // Create instance of Random class
        Random rand = new Random();

        // Enter customer name
        String customerName, customerAccountNumber;
        System.out.print("Please enter your name: ");
        customerName = scanner.nextLine();
        customerAccountNumber = String.format("%04d", rand.nextInt(1000) + 1);

        // Create account
        Account customerAccount = new Account(customerAccountNumber, customerName);

        // Menu

        String userInput;
        do {
            System.out.println("Welcome " + customerAccount.getHolderName() + "! Your account number is: " + customerAccount.getAccountNumber() + ". What would you like to do?");
            System.out.println("Withdraw (w), Deposit (d), Exit (e)");
            userInput = scanner.nextLine();

            // Operations
            switch(userInput) {
                case "w":
                    String withdrawAmount;
                    System.out.println("How much would you like to withdraw (€)?");
                    withdrawAmount = scanner.nextLine();
                    customerAccount.withdraw(withdrawAmount);
                    break;
                case "d":
                    String depositAmount;
                    System.out.println("How much would you like to deposit (€)?");
                    depositAmount = scanner.nextLine();
                    customerAccount.deposit(depositAmount);
                    break;
                case "e":
                    System.out.println("Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid input! Please choose a valid operation.");
            }

        } while (!userInput.equals("e"));

        // Close Scanner
        scanner.close();
    }
}
