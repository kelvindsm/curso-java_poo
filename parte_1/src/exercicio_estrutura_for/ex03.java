package exercicio_estrutura_for;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cont = sc.nextInt();

        int p1 = 2;
        int p2 = 3;
        int p3 = 5;

        for (int i  = 0; i < cont; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double media = ((a * 2) + (b * 3) + (c * 5)) / (p1 + p2 + p3);
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
