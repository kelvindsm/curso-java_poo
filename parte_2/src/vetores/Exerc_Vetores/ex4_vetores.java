package vetores.Exerc_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex4_vetores {
    /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
    tela todos os números pares, e também a quantidade de números pares. */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNumeros Pares: ");
        int pares = 0;
        for (int i = 0; i < n; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                pares++;
            }
        }

        System.out.printf("\n\nQuantidade de pares = %d\n", pares);

        sc.close();
    }
}
