package vetores.Exerc_Vetores;

import vetores.entitites.PessoasEx9;

import java.util.Scanner;

public class ex9_vetores {
    /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
    devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
    da pessoa mais velha. */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        PessoasEx9[] vect = new PessoasEx9[n];

        for (int i = 0; i < vect.length; i++){
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new PessoasEx9(nome, idade);
        }

        int maioridade = vect[0].getIdade();
        int posicaomaior = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() > maioridade){
                maioridade = vect[i].getIdade();
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", vect[posicaomaior].getPessoa());

        sc.close();
    }
}
