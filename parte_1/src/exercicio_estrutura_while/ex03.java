package exercicio_estrutura_while;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (numero != 4) {
            if (numero == 1){
                alcool++;
            } else if (numero == 2){
                gasolina++;
            } else if (numero == 3){
                diesel++;
            }
            numero = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
