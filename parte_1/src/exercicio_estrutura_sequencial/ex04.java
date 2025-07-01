package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        double nfuncionario, hraTrabalhadas, valorphra, salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        nfuncionario = sc.nextDouble();
        hraTrabalhadas = sc.nextDouble();
        valorphra = sc.nextDouble();

        salario = (hraTrabalhadas * valorphra);

        System.out.println("Number = " + nfuncionario);
        System.out.printf("Salario = R$ %.2f", salario);
    }
}
