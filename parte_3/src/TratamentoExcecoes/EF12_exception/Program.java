package TratamentoExcecoes.EF12_exception;

import TratamentoExcecoes.EF12_exception.entities.Account;
import TratamentoExcecoes.EF12_exception.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da conta");
        System.out.print("Numero da conta: ");
        int accountNumber = sc.nextInt();
        System.out.print("Titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(accountNumber, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Entre com o valor de saque: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
