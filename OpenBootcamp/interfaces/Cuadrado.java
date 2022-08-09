package OpenBootcamp.interfaces;

public class Cuadrado implements Figura, dibujable {

    private int lado;

    public Cuadrado() {

    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        int Formula = lado * lado;
        return Formula;
    }

    @Override
    public void dibujar() {
        System.out.println("estas dibujando un cuadrado");

    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + "]";
    }

}
