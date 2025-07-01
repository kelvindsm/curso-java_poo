package exercicios_classes.ex02Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee func = new Employee();

        System.out.println("Digite os dados: ");
        System.out.print("Nome: ");
        func.name = sc.nextLine();
        System.out.print("Salario bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Impostos: ");
        func.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + func);
        System.out.println();
        System.out.print("Porcentagem de acréscimo no salario: ");
        double porcentagem = sc.nextDouble();
        func.proximoSalario(porcentagem);

        System.out.println();
        System.out.println("Atualizado: " + func);

        sc.close();
    }
}
