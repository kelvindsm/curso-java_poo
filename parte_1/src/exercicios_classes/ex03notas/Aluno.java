package exercicios_classes.ex03notas;

public class Aluno {

    public String name;
    public double Nota1;
    public double Nota2;
    public double Nota3;

    public double somaNotas(){
        return Nota1 + Nota2 + Nota3;
    }
    public double pontosNecessarios() {
        if (somaNotas() < 60.0){
            return 60.0 - somaNotas();
        } else {
            return 0.0;
        }
    }
}
