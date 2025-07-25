package TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AulaExcecoes {
    public static void main(String[] args) {

        method1();
        System.out.println("Fim do programa");
    }

    public static void method1() {
        System.out.println("***INICIO DO MÉTODO 1***");
        method2();
        System.out.println("***FIM DO MÉTODO 1***");
    }

    public static void method2() {
        System.out.println("***INICIO DO MÉTODO 2***");
        Scanner sc = new Scanner(System.in);

        try { // bloco de código onde ficam os códigos comuns que podem apresentar exceções no momento da execução
            String[] vect = sc.nextLine().split(" "); // varios valores em uma mesma linha, separadas por espaços em branco
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (
                ArrayIndexOutOfBoundsException e) { // Seção de código onde executa outro bloco de códigos em caso de exceções no primeiro bloco
            System.out.println("Posição inválida");
            e.printStackTrace(); // imprime na tela o rastreamento do Stack
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro de input");
        }

        sc.close();
        System.out.println("***FIM DO MÉTODO 2***");
    }
}
