package vetores.Exerc_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex5_vetores {
    /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
    o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
    considerando a primeira posição como 0 (zero). */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        int posmaior = 0;

        for (int i = 0; i < n; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("Posição do maior valor = %d\n", posmaior);

        sc.close();
    }
}
