package composicoes.exercicioResolvido01.entities;

import composicoes.exercicioResolvido01.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department; // associação (n..1) de Worker-Department - um worker tem associação com um department
    private List<HourContract> contracts = new ArrayList<>(); // associação de Worker-contracts (1..n) - tem vários contratos, é representado por lista

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    /*public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
        // Não pode deixar essa operação, pois a lista de contratos será trocada por uma outra lista de contratos
        // A lista inicia vazia, depois será possivel adicionar e remover contratos dela
        // O setContracts criaria uma nova lista, excluindo os dados anteriores...
    }*/

    // metodos

    // Métodos responsáveis por fazer e desfazer a associação do contrato, adicionando e removendo contratos da lista
    public void addContract(HourContract contract) { // pega a lista de contratos para adicionar outro contrato a ela como argumento
        contracts.add(contract);
        // private List<HourContract> contracts = new ArrayList<>();
    }

    public void removeContract(HourContract contract) { // remove contratos relativos ao worker da list
        contracts.remove(contract);
    }

    public double income(int year, int month) { // salario base + ganhos dos contratos = renda do mês
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) { // "para cada contrato c na lista de contratos..."
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
