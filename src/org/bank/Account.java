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
        this.holderName = handleName(holderName);
        this.balance = new BigDecimal(0);
    }


    // METHODS

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = handleName(holderName);
    }

    public String getBalance() {
        return String.format("%.2f", balance) + "€";
    }

    // To String
    @Override
    public String toString() {
        return "Account{" +
                "Account Number='" + accountNumber + '\'' +
                ", Holder Name='" + holderName + '\'' +
                ", Balance=" + String.format("%.2f", balance) + "€" +
                '}';
    }

    // Other methods
    private String handleName(String holderName){
        if (!holderName.isEmpty()){
            return holderName;
        } else {
            return "User";
        }
    }

    public void deposit(String amount) {
        BigDecimal bigDecimalAmount = new BigDecimal(amount);
        if (bigDecimalAmount.compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.add(bigDecimalAmount);
            System.out.println("Money deposited successfully! Your current balance is: " + getBalance());
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public void withdraw(String amount) {
        BigDecimal bigDecimalAmount = new BigDecimal(amount);
        if (bigDecimalAmount.compareTo(BigDecimal.ZERO) >= 0) {
            if (balance.subtract(bigDecimalAmount).compareTo(BigDecimal.ZERO) >= 0) {
                balance = balance.subtract(bigDecimalAmount);
                System.out.println("Money withdrawn successfully! Your current balance is: " + getBalance());
            } else {
                System.out.println("Insufficient funds. Your current balance is: " + getBalance());
            }
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }
}
