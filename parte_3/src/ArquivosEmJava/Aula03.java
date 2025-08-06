package ArquivosEmJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula03 {
    public static void main(String[] args) {
        // "processo manual": implementação basica mostrando o processo manual
        String path = "C:\\Users\\kmartins\\Desktop\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //instancia as streams direto no bloco try
            String line = br.readLine(); // lê uma linha do arquivo, se o arquivo estiver no final, será retornado nulo

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
