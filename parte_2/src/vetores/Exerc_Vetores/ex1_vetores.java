package vetores.Exerc_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex1_vetores {
    /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        if (n > 10){
            System.out.println("Digite um valor menor que 10");
        }

        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for(int i = 0; i < n; i++){
            if(vect[i] < 0){
                System.out.printf("%d\n", vect[i]);
            }
        }

    sc.close();
    }
}
