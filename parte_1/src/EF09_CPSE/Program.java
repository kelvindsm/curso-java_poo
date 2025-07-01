package EF09_CPSE;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Entre com o nome do titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Deseja realizar um depósito inicial (s/n)? ");
        char opcao = sc.next().charAt(0);

        if (opcao == 's'){
            System.out.print("Entre com o depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        } else {
            conta = new Conta(numero, nome, 0.0);
        }

        System.out.println("Dados da conta: " + conta);
        System.out.println(" ");
        System.out.print("Entre com um valor de depósito: ");
        double deposito = sc.nextDouble();
        conta.AddDeposito(deposito);
        System.out.println(" ");

        System.out.println("Dados atualizados: ");
        System.out.println("Dados da conta: " + conta);
        System.out.println(" ");

        System.out.print("Entre com um valor de saque: ");
        double saque = sc.nextDouble();
        conta.Saque(saque);
        System.out.println(" ");

        System.out.println("Dados da conta: " + conta);
    }
}
