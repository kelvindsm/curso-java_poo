package listas.EF11_funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.println("Quantos empregados deseja registrar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Empregado #" + (i + 1) + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)){ // "enquanto esse ID existe na lista..."
                System.out.println("Este ID já existe. Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();

            Empregado emp = new Empregado(id, name, salary);
            list.add(emp);

            //list.add(new Empregado(id, name, salary));
        }

        System.out.println();
        System.out.print("Entre com o ID do empregado que terá um aumento de salário: ");
        int idSalary = sc.nextInt();
        Empregado emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null); // procura a primeira ocorrencia
        if (emp == null){
            System.out.println("Este ID não existe");
        } else {
            System.out.print("Entre com o percentual: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de empregados: ");
        for (Empregado e : list){
            System.out.println(e);
        }

        sc.close();
    }
    public static boolean hasId(List<Empregado> list, int id){ // retorna verdadeiro se o ID existe *
        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
