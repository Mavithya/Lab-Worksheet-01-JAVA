package Q3;

public class BankAccount {
    private double balance;
    BankAccount(){
        balance = 0;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double value){
        if(balance >= value){
            balance -= value;
        } else {
            System.out.println("Insufficient funds.Cannot Withdraw");
        }
    }
    public double getBalance(){
        return balance;
    }
}
