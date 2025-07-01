package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        int codpc1, numpc1, codpc2, numpc2;
        double vlrpc1, vlrpc2, vlrtotal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        codpc1 = sc.nextInt();
        numpc1 = sc.nextInt();
        vlrpc1 = sc.nextDouble();

        codpc2 = sc.nextInt();
        numpc2 = sc.nextInt();
        vlrpc2 = sc.nextDouble();

        vlrtotal = (numpc1 * vlrpc1) + (numpc2 * vlrpc2);

        System.out.printf("Valor a pagar: R$ %.2f", vlrtotal);
    }
}
