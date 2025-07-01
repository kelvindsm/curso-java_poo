package vetores.Exerc_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex7_vetores {
    /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
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
        System.out.printf("\nMEDIA DO VETOR = %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < media){
                System.out.printf("\n%.1f",vect[i]);
            }
        }

        sc.close();
    }
}
