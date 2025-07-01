package vetores.entitites;

public class Pessoa {
    private String pessoa;
    private int idade;
    private double altura;

    public Pessoa(String pessoa, int idade, double altura) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.altura = altura;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
