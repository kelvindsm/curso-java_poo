package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        double A, B, C;
        double pi = 3.14159;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double artri = ((A * C) / 2);
        double arcirc = (pi * Math.pow(C, 2));
        double artrap = ((A + B) * C) / 2;
        double arquad = (Math.pow(B,2));
        double aret = (A * B);

        System.out.printf("Triangulo: %.3f%n", artri);
        System.out.printf("Circulo: %.3f%n", arcirc);
        System.out.printf("Trapézio: %.3f%n", artrap);
        System.out.printf("Quadrado: %.3f%n", arquad);
        System.out.printf("Retangulo: %.3f%n", aret);
    }
}
