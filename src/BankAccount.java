/**
 * Created by SOPHIE Zhang on 12/20/20.
 */
public class BankAccount {
    public String name;
    private int accontNum;
    private double balance;

    public static int numberOfAccounts;


    public BankAccount(String name, int accontNum, double balance) {
        this.name = name;
        this.accontNum = accontNum;
        this.balance = balance;
        numberOfAccounts++;
    }

    @Override
    public String toString(){
        return this.accontNum + ":" + this.name + ": " +this.balance;
    }

    public void withdraw(int amount) {
        if(amount < this.balance) {
            this.balance -= amount;
        }
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public static int getNumberOfAccounts(){
        return BankAccount.numberOfAccounts;
    }
}
