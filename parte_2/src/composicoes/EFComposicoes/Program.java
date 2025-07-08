package composicoes.EFComposicoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome");
        String name = sc.nextLine();
        System.out.print("Entre com o Email");
        String email = sc.nextLine();
        System.out.println("Entre com a data de nascimento: ");
        Date birthday = sdf.parse(sc.next());

        System.out.println();

        System.out.print("Entre com os dados do pedido: ");
        String status = sc.nextLine();
        System.out.print("Quantos itens para este pedido? ");
    }
}
