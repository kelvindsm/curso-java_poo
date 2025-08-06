package ArquivosEmJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula02 {
    public static void main(String[] args) {
        // "processo manual": implementação basica mostrando o processo manual
        String path = "C:\\Users\\kmartins\\Desktop\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // instanciado a partir do filereader, sendo ele de abstração maior. Pega a string básica para instanciar a stream com esquema de buffer

            String line = br.readLine(); // lê uma linha do arquivo, se o arquivo estiver no final, será retornado nulo

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace(); // retorna o erro completo
            }
        }
    }
}
