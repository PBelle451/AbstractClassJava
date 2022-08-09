package co.pedrobelle.curso.Ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        System.out.println("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);
            System.out.println("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Anual income: ");
            double income = scanner.nextDouble();
            if (ch == 'i'){
                System.out.println("Health expenditures: ");
                double healthexpenditures = scanner.nextDouble();
                list.add(new Individual(name, income, healthexpenditures));
            } else {
                System.out.println("Number of employees: ");
                int employees = scanner.nextInt();
                list.add(new Company(name, income, employees));
            }
        }
        double sum = 0.0;
        System.out.println("TAXES PAID: ");
        for(TaxPayer taxPayer : list){
            double tax = taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        scanner.close();
    }
}