package ArquivosEmJava;

import java.io.File;
import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um diretório de arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // pega somente o nome do arquivo
        System.out.println("getParent: " + path.getParent()); // pega somente o caminho do arquivo
        System.out.println("getPath: " + path.getPath()); // pega o caminho completo do arquivo (caminho e nome do arquivo)

        sc.close();
    }
}
