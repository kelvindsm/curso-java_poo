package herancaPolimorfismo.AulaHeranca;

public final class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override   // informa para o compilado de que isso se trata de uma sobreposição.
    // Override serve para sobrescrever um metodo que existe em uma classe base mas precisa ser modificada em uma subclasse.
    public final void withdraw(double amount) {
        balance -= amount;
    }
}