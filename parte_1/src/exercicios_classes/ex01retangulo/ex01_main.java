package exercicios_classes.ex01retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ex01_main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();

        System.out.println("Entre com a largura e altura do retângulo: ");
        rect.rWidth = sc.nextDouble();
        rect.rHeight = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rect.Area());
        System.out.printf("Perimetro = %.2f%n" , rect.Perimeter());
        System.out.printf("Diagonal = %.2f%n", rect.Diagonal());
    }
}
