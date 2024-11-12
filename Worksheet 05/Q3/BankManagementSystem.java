package Q3;

public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();


        account1.deposit(100000);
        account1.withdraw(1500);


        System.out.println("Account 1 Balance: " + account1.getBalance());

    }
}
