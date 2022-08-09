package co.pedrobelle.curso.Ex35;

public class BusinessAccount extends AccountData {

    private double loanlimit;

    public BusinessAccount(int number, String holder, double balance, double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan(double amount){
        if(amount <= loanlimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
