package vetores.Exerc_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex6_vetores {
    /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
    terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
    o vetor C gerado.*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores cada vetor terá? ");
        int n = sc.nextInt();

        int[] vet1 = new int[n];
        int[] vet2 = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++){
            vet1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:" );
        for (int j = 0; j < n; j++){
            vet2[j] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int s = 0; s < n; s++){
            int soma = vet1[s] + vet2[s];
            System.out.println(soma);
        }

        sc.close();
    }
}
