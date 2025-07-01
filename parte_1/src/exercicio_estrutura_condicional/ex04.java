package exercicio_estrutura_condicional;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int horain, horaout;

        Scanner sc = new Scanner(System.in);
        horain = sc.nextInt();
        horaout = sc.nextInt();

        int duracao;
        if (horain < horaout) {
            duracao = horaout - horain;
        } else {
            duracao = 24 - horain + horaout;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
    }
}