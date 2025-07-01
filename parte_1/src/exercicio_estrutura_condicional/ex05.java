package exercicio_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        int codItem, qtdItem;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        codItem = sc.nextInt();
        qtdItem = sc.nextInt();

        if (codItem == 1){
            double multi = (4.0 * qtdItem);
            System.out.printf("Total: R$ %.2f", multi);
        } else if (codItem == 2){
            double multi = (4.5 * qtdItem);
            System.out.printf("Total: R$ %.2f", multi);
        } else if (codItem == 3){
            double multi = (5.0 * qtdItem);
            System.out.printf("Total: R$ %.2f", multi);
        } else if (codItem == 4){
            double multi = (2.0 * qtdItem);
            System.out.printf("Total: R$ %.2f", multi);
        } else if (codItem == 5){
            double multi = (1.5 * qtdItem);
            System.out.printf("Total: R$ %.2f", multi);
        }
    }
}
