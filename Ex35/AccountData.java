package co.pedrobelle.curso.Ex35;

public class AccountData {
    private int number;
    private String holder;
    protected double balance;

    public AccountData(int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber(){
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5.0;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: " + balance;
    }

}
