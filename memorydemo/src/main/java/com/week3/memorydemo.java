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

        // Third experiment: Methods and Parameter Passing
        BankAccount myAccount = new BankAccount();
        myAccount.balance = 500;
        applyBonusToAccount(myAccount);
        System.out.println("myAccount: " + myAccount.balance);
        
    } // <-- Added closing brace to properly end the main method here

    // These methods now sit cleanly inside the class, but outside of main
    public static void applyBonusToAccount(BankAccount acc) {
        acc.balance = acc.balance + 100;
    }

    public static void applyBonusToAmount(int amount) {
        amount = amount + 100;
        int cash = 500;
applyBonusToAmount(cash);
System.out.println("cash: " + cash);
    }

} // <-- Added closing brace to properly end the memorydemo class here

// --- empty class to help code run---
class BankAccount {
    int balance;
}
