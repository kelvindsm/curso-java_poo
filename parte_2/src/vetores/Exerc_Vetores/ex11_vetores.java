package vetores.Exerc_Vetores;

import vetores.entitites.PessoasEx11;

import java.util.Locale;
import java.util.Scanner;

public class ex11_vetores {
    /*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
    que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
    de homens. */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        PessoasEx11[] vect = new PessoasEx11[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            char genero = sc.next().charAt(0);
            vect[i] = new PessoasEx11(altura, genero);
        }

        double menoraltura = vect[0].getAltura();
        double maioraltura = vect[0].getAltura();

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAltura() > maioraltura){
                maioraltura = vect[i].getAltura();
            }
            if (vect[i].getAltura() < maioraltura){
                maioraltura = vect[i].getAltura();
            }
        }

        int qtdeHomens = 0;
        int qtdeMulheres = 0;
        double alturaFemTotal = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAltura() == 'M'){
                qtdeHomens++;
            }
            else {
                qtdeMulheres++;
                alturaFemTotal = alturaFemTotal + vect[i].getAltura();
            }
        }

        alturaFemTotal = alturaFemTotal / qtdeMulheres;

        System.out.printf("Menor altura = %.2f\n", menoraltura);
        System.out.printf("Maior altura = %.2f\n", maioraltura);
        System.out.printf("Média das alturas das mulheres = %.2f\n", alturaFemTotal);
        System.out.printf("Numero de homens %d\n", qtdeHomens);


        sc.close();
    }
}
