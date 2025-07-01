package exercicio_estrutura_for;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int um = i;
            int dois = i*i;
            int tres = i*i*i;

            System.out.printf("%d %d %d%n", um, dois, tres);
        }
        sc.close();
    }
}
