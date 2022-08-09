package co.pedrobelle.curso.Ex35;

import java.util.Objects;
import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert account number: ");
        int numero = scanner.nextInt();
        System.out.println("Insert account holder: ");
        String nome = scanner.next();
        System.out.println("Do you want to do an initial deposit?[y/n]: ");
        String option = scanner.next();
        double deposito = 0;
        if (Objects.equals(option, "y")) {
            System.out.println("Insert your initial deposit: ");
            deposito = scanner.nextDouble();
            AccountData accountData = new AccountData(numero, nome, deposito);
            accountData.depositValue(deposito);
            System.out.println(accountData.toString());
        } else if (Objects.equals(option, "n")) {
            System.out.println("Broke ass nigga");
            AccountData accountData = new AccountData(numero, nome, deposito);
            System.out.println(accountData.toString());
        } else {
            System.out.println("Please insert a valid option");
        }

        System.out.println("Do you want to do another transaction?[y/n]: ");
        String transaction = scanner.next();
        if (Objects.equals(transaction, "y")){
            System.out.println("Select the transaction you want to do\n[1]-Deposit\n[2]-Withdrawl\n[3]-Exit");
            int option1 = scanner.nextInt();
            if (option1 < 1 || option1 > 3){
                System.out.println("Please insert a valid option");
                return;
            } else {
                AccountData accountData = new AccountData(numero, nome, deposito);
                switch (option1) {
                    case 1 -> {
                        System.out.println("Enter the amount you want to deposit: ");
                        double deposit = scanner.nextDouble();
                        accountData.depositValue(deposit);
                        System.out.println(accountData.toString());
                        return;
                    }
                    case 2 -> {
                        System.out.println("Enter the amount you want to withdarwl: ");
                        double withdrawl = scanner.nextDouble();
                        accountData.withdraw(withdrawl);
                        System.out.println(accountData.toString());
                        return;
                    }

                    case 3 -> System.out.println("Thank you for everything!");
                }
            }
        } else if (Objects.equals(transaction, "n")){
            System.out.println("Thank you for everything!");
        } else {
            System.out.println("Insert a valid option");
            return;
        }
        scanner.close();
    }
}
