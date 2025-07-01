package exercicio_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        double salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();

        if (salario <= 2000){
            System.out.println("Isento");
        } else if (salario <= 3000){
            System.out.printf("R$ %.2f", ((salario - 2000) * 0.08));
        } else if (salario <= 4500){
            System.out.printf("R$ %.2f", ((salario - 3000) * 0.18 + 1000.0 * 0.08));
        } else if (salario > 4500){
            System.out.printf("R$ %.2f", ((salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08));
        }
    }
}
