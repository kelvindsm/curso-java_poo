package ArquivosEmJava.EPItensVendidoscsv;

import ArquivosEmJava.EPItensVendidoscsv.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Entre com o arquivo para leitura: ");
        String rootPath = sc.nextLine();

        try(){

        }catch (){

        }


        sc.close();
    }
}
