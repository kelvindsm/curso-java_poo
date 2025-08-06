package ArquivosEmJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula04 {
    public static void main(String[] args) {

        String[] lines = new String[]{"Bom dia", "Boa tarde", "Boa noite"};

        String path = "C:\\Users\\kmartins\\Desktop\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // true no parametro: indica para não cria um novo arquivo, e sim adicionar novas informações nele.
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
