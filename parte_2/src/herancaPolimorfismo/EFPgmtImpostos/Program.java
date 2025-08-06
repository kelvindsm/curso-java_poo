package herancaPolimorfismo.EFPgmtImpostos;

import herancaPolimorfismo.EFPgmtImpostos.entities.Company;
import herancaPolimorfismo.EFPgmtImpostos.entities.Individual;
import herancaPolimorfismo.EFPgmtImpostos.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o numero de pagadores de impostos: ");
        int payers = sc.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= payers; i++) {
            sc.nextLine();
            System.out.println("Pagador #" + i + ":");
            System.out.print("Invidual o companhia (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Faturamento anual: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Dispesas médicas: ");
                double healthExpeditures = sc.nextDouble();
                Individual ind = new Individual(name, anualIncome, healthExpeditures);
                taxPayers.add(ind);
            } else {
                System.out.print("Quantidade de funcionários: ");
                int qtdeEmployee = sc.nextInt();
                Company comp = new Company(name, anualIncome, qtdeEmployee);
                taxPayers.add(comp);
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("Impostos pagos: ");
        for (TaxPayer tp : taxPayers) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("Total Taxes: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
