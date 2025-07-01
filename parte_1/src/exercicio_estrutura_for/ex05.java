package exercicio_estrutura_for;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fat = 1;

        for(int i = 1; i <= num; i++) {
            fat = fat * i;
        }

        System.out.println(fat);
        sc.close();
    }
}
