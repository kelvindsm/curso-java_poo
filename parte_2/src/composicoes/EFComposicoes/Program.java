package composicoes.EFComposicoes;

import composicoes.EFComposicoes.entities.Client;
import composicoes.EFComposicoes.entities.Order;
import composicoes.EFComposicoes.entities.OrderItem;
import composicoes.EFComposicoes.entities.Product;
import composicoes.EFComposicoes.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Entre com o Email: ");
        String email = sc.nextLine();
        System.out.print("Entre com a data de nascimento: ");
        Date birthday = sdf.parse(sc.next());

        Client client = new Client(name, email, birthday);

        System.out.println();

        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("Quantos itens para este pedido? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Entre com os dados do item nº " + i + ": ");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Preço do produto: ");
            double productPrice = sc.nextDouble();

            Product products = new Product(productName, productPrice);

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, products);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("PEDIDO: ");
        System.out.println(order);

        sc.close();
    }
}
