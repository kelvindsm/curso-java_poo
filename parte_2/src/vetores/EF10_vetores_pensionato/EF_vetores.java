package vetores.EF10_vetores_pensionato;

import java.util.Scanner;

public class EF_vetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DadosPensionato[] vect = new DadosPensionato[10];

        System.out.print("Quantos quartos serão alugados? ");
        int qtde = sc.nextInt();

        for (int i = 1; i <= qtde; i++){
            sc.nextLine();
            System.out.println();
            System.out.println("Quarto #" + i + ":");
            System.out.print("\nNome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new DadosPensionato(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < vect.length; i++){
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
