package ArquivosEmJava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula01 {
    // Aula 155
    public static void main(String[] args) {

        File file = new File("C:\\Users\\kmartins\\Desktop\\in.txt.txt"); // duas barras são necessárias pois a primeira permite que a primeira lê a segunda
        // File: encapsula o processo e o caminho de acesso do arquivo
        Scanner sc = null;
        try {
            // instanciação do scanner no arquivo
            sc = new Scanner(file);
            while (sc.hasNextLine()) { // verifica se tem alguma linha no arquivo
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) { // exceção padrão que lida com entrada de arquivos
            System.out.println("Error: " + e.getMessage());
        } finally { // boa prática: adicionar o ultimo recurso no finally, que será executado idependente de falha ou erro
            if (sc != null) { // evita com que o scanner nulo cause uma NullPointerException caso o sc.close seja executado
                sc.close();
            }
        }
    }
}
