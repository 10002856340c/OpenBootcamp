package POO.Clases;

public class Mercedez {
    // Atributos
    protected String Fabricante;
    protected String Modelo;
    protected double cc;
    protected int year;

    protected double velocidad;

    // Constructores

    public Mercedez() {

    }

    public Mercedez(String fabricante, String modelo, double cc, int year, double velocidad) {
        Fabricante = fabricante;
        Modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.velocidad = velocidad;
    }

    // Metodos que queramos hacer cada vez que se llamen

    public void AcelerarMercedez(double kilometros) {
        this.velocidad += kilometros;

    }

    // Getter and setters

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}
