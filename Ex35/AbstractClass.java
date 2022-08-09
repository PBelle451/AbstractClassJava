package co.pedrobelle.curso.Ex35;

import java.util.ArrayList;
import java.util.List;

public class AbstractClass {
    public static void main(String[] args) {
        List<AccountData> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (AccountData acc : list){
            sum += acc.getBalance();
        }

        System.out.println("Total balance: " + sum);

        for (AccountData acc : list){
            acc.depositValue(10.0);
        }
        for(AccountData acc : list){
            System.out.println("Updated balance for account: " + acc.getNumber() + acc.getBalance());
        }
    }
}
