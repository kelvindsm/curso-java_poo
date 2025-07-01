package EF08_Introducao_POO;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double conversor(double cotacaoDolar, double valorParaDolar){
        return cotacaoDolar * valorParaDolar * (1.0 + IOF);
    }
}