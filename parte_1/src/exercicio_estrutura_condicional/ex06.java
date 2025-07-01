package exercicio_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double vlrInter = sc.nextDouble();

        if (vlrInter < 0.0 || vlrInter > 100){
            System.out.println("Fora do intervalo");
        } else if (vlrInter <= 25.0){
            System.out.println("Intervalo [0,25]");
        } else if (vlrInter <= 50.0){
            System.out.println("Intervalo (25,50]");
        } else if (vlrInter <= 75.0){
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }
    }
}
