package EF09_CPSE;

public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        AddDeposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void AddDeposito(double saldoConta){
        this.saldoConta +=  saldoConta;
    }

    public double Saque(double saldoConta){
        return this.saldoConta -= (saldoConta + 5.0);
    }

    public String toString() {
        return "Conta: " + numeroConta
                + ", Titular: " + nomeTitular
                + ", Saldo: $ " + saldoConta;
    }

}
