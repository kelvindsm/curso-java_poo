package vetores.Exerc_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex2_Vetores {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
          - Imprimir todos os elementos do vetor
          - Mostrar na tela a soma e a média dos elementos do vetor*/

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i];
        }
        double media = soma / vect.length;

        System.out.println("VALORES = ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
