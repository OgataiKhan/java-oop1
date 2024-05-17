package org.bank;

import java.math.BigDecimal;

public class Account {
    // ATTRIBUTES

    private String accountNumber;
    private String holderName;
    private BigDecimal balance;

    // CONSTRUCTORS

    public Account(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = new BigDecimal(0);
    }


    // METHODS

    // Getters and Setters
    public String getAccountNumber() {
        return "Your account number is: " + accountNumber;
    }

    public String getHolderName() {
        return "The account holder's name is: " + holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getBalance() {
        return "Your current balance is: " + balance + "€";
    }

    // To String
    @Override
    public String toString() {
        return "Account{" +
                "Account Number='" + accountNumber + '\'' +
                ", Holder Name='" + holderName + '\'' +
                ", Balance=" + balance + "€" +
                '}';
    }

    // Other methods
    public void deposit(int amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
        System.out.println("Money deposited successfully!");
    }

    public void withdraw(int amount) {
        if (balance.subtract(BigDecimal.valueOf(amount)).compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(amount));
            System.out.println("Money withdrawn successfully!");
        } else {
            System.out.println("Insufficient funds. Please check your account balance or try a smaller amount.");
        }
    }
}
