package herancaPolimorfismo.EFProducts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Produto #" + i + ":");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'u') {
                sc.nextLine();
                System.out.print("Produto: ");
                String product = sc.nextLine();
                System.out.print("Preço: ");
                double price = sc.nextDouble();
                System.out.print("Data de manufatura (DD/MM/AAAA): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(product, price, date));
            } else if (ch == 'i') {
                sc.nextLine();
                System.out.print("Produto: ");
                String product = sc.nextLine();
                System.out.print("Preço: ");
                double price = sc.nextDouble();
                System.out.print("Valor da taxa: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(product, price, customFee));
            } else {
                sc.nextLine();
                System.out.print("Produto: ");
                String product = sc.nextLine();
                System.out.print("Preço: ");
                double price = sc.nextDouble();
                list.add(new Product(product, price));
            }
        }
        System.out.println();
        System.out.println("PRODUTOS");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
