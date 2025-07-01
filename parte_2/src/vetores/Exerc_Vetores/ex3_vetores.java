package vetores.Exerc_Vetores;

import vetores.entitites.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ex3_vetores {
    /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver. */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i].getAltura();
        }
        double media = soma / vect.length;
        System.out.printf("Altura média: %.2f", media);

        double menores = 0;
        for (int i = 0; i<n; i++){
            if(vect[i].getIdade() < 16){
                menores++;
            }
        }

        double percentual = (menores / n) * 100.0;
        System.out.println("\nPessoas com menos de 16 anos: " + percentual + "%");

        for (int i = 0; i<n; i++){
            if (vect[i].getIdade() < 16){
                System.out.printf("%s\n", vect[i].getPessoa());
            }
        }

        sc.close();
    }
}
