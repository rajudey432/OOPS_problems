package com.bridgelabz.oops;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(100.0);
        System.out.println("Initial balance of account1: " + account1.getBalance());

        account1.credit(50.0);
        System.out.println("New balance of account1 after crediting 50.0: " + account1.getBalance());

        account1.debit(20.0);
        System.out.println("New balance of account1 after debiting 20.0: " + account1.getBalance());

        account1.debit(200.0);
        System.out.println("New balance of account1 after debiting 200.0: " + account1.getBalance());
    }
}