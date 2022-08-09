package OpenBootcamp.interfaces;

public class Circulo implements Figura, Rotable, dibujable {

    // Atributos
    private double radio;

    // Constructores
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    // instancias de las otras interfaces
    @Override
    public double CalcularArea() {
        double pi = 3.1416;
        double formula = pi * this.radio * this.radio;
        return formula;
    }

    @Override
    public void dibujar() {
        System.out.println("estas dibujando un circulo");

    }

    @Override
    public void rotar() {
        System.out.println("Estas rotando un circulo");

    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

}
