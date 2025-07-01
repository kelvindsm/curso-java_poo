package vetores.Exerc_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex8_vetores {
    /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
    aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
    digitado, mostrar a mensagem "NENHUM NUMERO PAR" */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos terá o vetor? ");
        int lim = sc.nextInt();
        int[] vect = new int[lim];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int soma = 0, npares = 0;
        double media = 0.0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                soma += vect[i];
                npares++;
            }
        }

        if (npares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = (double)soma / npares;
            System.out.printf("MEDIA DOS PARES = %.2f", media);
        }

        sc.close();
    }
}
