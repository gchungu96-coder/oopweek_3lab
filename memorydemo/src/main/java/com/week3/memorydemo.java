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
        
        // --- NEW MODIFICATIONS MOVED TO MAIN ---
        
        // Testing Primitive Parameter Passing
        int cash = 500;
        applyBonusToAmount(cash);
        System.out.println("cash: " + cash); // Will print 500 because primitives are passed by value!

        // Handling Null References
        BankAccount acc3 = null;
        
        // UNCOMMENT THE LINE BELOW TO SEE THE CRASH:
        // System.out.println(acc3.balance); // This throws a NullPointerException because acc3 points to nothing.

        // Safe check preventing a crash
        if (acc3 != null) {
            System.out.println(acc3.balance);
        } else {
            System.out.println("Account not found");
        }
        
    } // End of main method

    // These helper methods stay cleanly outside of main
    public static void applyBonusToAccount(BankAccount acc) {
        acc.balance = acc.balance + 100;
    }

    public static void applyBonusToAmount(int amount) {
        amount = amount + 100;
    }

} // End of memorydemo class

// --- empty class to help code run---
class BankAccount {
    int balance;
}
