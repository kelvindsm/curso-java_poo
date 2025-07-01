package exercicios_classes.ex03notas;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.name = sc.nextLine();
        aluno.Nota1 = sc.nextDouble();
        aluno.Nota2 = sc.nextDouble();
        aluno.Nota3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", aluno.somaNotas());

        if (aluno.somaNotas() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("Faltam %.2f pontos", aluno.pontosNecessarios());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
