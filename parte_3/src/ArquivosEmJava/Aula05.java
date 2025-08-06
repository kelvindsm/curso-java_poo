package ArquivosEmJava;

import java.io.File;
import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caminho de pasta");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // lendo subpastas em uma pasta
        File[] folders = path.listFiles(File::isDirectory); // reference methods: referencia à métodos -
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // lendo arquivos em uma pasta
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        // criando subpasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso!");

        sc.close();
    }
}
