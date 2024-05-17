package org.bank;

public class Bank {
    public static void main(String[] args) {
        Account account1234 = new Account("1234", "Mario Rossi");

        System.out.println(account1234);
        account1234.deposit(10);
        System.out.println(account1234.getBalance());
        account1234.withdraw(20);
        System.out.println(account1234.getBalance());
        account1234.withdraw(5);
        System.out.println(account1234.getBalance());
    }
}
