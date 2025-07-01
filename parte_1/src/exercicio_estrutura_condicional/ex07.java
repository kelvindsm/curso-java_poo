package exercicio_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        double x, y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        } else if (x < 0 && y > 0){
            System.out.println("Q2");
        } else if (x <0 && y<0){
            System.out.println("Q3");
        } else if (x > 0 && y < 0){
            System.out.println("Q4");
        } else if (x == 0 && y == 0){
            System.out.println("Origem");
        }
    }
}
