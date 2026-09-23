// REMOVED: package accountmanager; (Delete this line if it's in the main/java root)

public class accountmanager {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.balance = 500;
        
        BankAccount acc2 = new BankAccount();
        acc2.balance = 750;
        
        BankAccount acc3 = acc1;
        
        System.out.println("acc1 balance: " + acc1.balance); 
        
        
        if (acc3 != null) {
            System.out.println("acc3 balance: " + acc3.balance);
        } else {
            System.out.println("acc3 balance: Account not found");
        }
    }

    public static BankAccount findAccount(String id) {
        return null; 
    }
}

class BankAccount {
    int balance;
}
