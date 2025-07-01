package vetores.Exerc_Vetores;

import vetores.entitites.AlunosEx10;

import java.util.Locale;
import java.util.Scanner;

public class ex10_vetores {
    /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
    no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
    os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
    igual a 6.0 (seis). */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        AlunosEx10[] vect = new AlunosEx10[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %da \n", i + 1);
            String nome = sc.nextLine();
            double primeiraNota = sc.nextDouble();
            double segundaNota = sc.nextDouble();
            vect[i] = new AlunosEx10(nome, primeiraNota, segundaNota);
        }

        double soma, media = 0.0;

        System.out.println("\nAlunos aprovados: " );
        for (int i = 0; i < vect.length; i++){
            soma =vect[i].getPrimeiraNota() + vect[i].getSegundaNota();
            media = soma / 2;
            if (media >= 6){
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
