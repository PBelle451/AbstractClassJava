package co.pedrobelle.curso.Ex35;

import co.pedrobelle.curso.Ex35.SavingsAccount;

public class SavingAccountPlus extends SavingsAccount {

    public SavingAccountPlus(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance, interestRate);
    }

    @Override
    public final void withdraw(double amount){
        balance -= amount + 2.0;
    }

}
