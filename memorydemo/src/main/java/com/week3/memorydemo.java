package com.week3;

public class memorydemo {
    public static void main(String[] args) {
        // First experiment: Primitives
        int balance = 1000;
        int copy = balance;
        copy = 500;
        
        System.out.println("balance: " + balance);
        System.out.println("copy: " + copy);

        // Second experiment: Reference Objects
        BankAccount acc1 = new BankAccount();
        acc1.balance = 1000;
        
        BankAccount acc2 = acc1;
        acc2.balance = 500;
        
        System.out.println("acc1: " + acc1.balance);
        System.out.println("acc2: " + acc2.balance);
    }
}

// --- ADD THIS AT THE BOTTOM OF YOUR FILE ---
class BankAccount {
    int balance;
}
