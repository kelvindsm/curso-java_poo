package exercicios_classes.ex01retangulo;

public class Retangulo {

    public double rHeight;
    public double rWidth;

    public double Area(){
        return rHeight * rWidth;
    }

    public double Perimeter(){
        return 2 * (rWidth + rHeight);
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(rHeight,2) + Math.pow(rWidth,2));
    }
}
