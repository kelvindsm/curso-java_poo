package EF08_Introducao_POO;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Quanto em dolar deseja comprar? ");
        double qtdDolar = sc.nextDouble();

        double resultado = CurrencyConverter.conversor(cotacaoDolar, qtdDolar);

        System.out.printf("Valor a ser pago em reais = R$ %.2f",  resultado);
    }
}
