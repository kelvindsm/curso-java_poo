package herancaPolimorfismo.EFPgmtImpostos.entities;

public class Individual extends TaxPayer {

    private Double healthBill;

    public Individual(String name, Double anualIncome, Double healthBill) {
        super(name, anualIncome);
        this.healthBill = healthBill;
    }

    public Double getHealthBill() {
        return healthBill;
    }

    public void setHealthBill(Double healthBill) {
        this.healthBill = healthBill;
    }

    @Override
    public double tax() {

        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthBill * 0.5;
        } else {
            return getAnualIncome() * 0.25 - healthBill * 0.5;
        }
    }
}
