package OpenBootcamp.POO;

public class Coche {

    // ATRIBUTOS
    String color;
    String fabricante;
    String modelo;
    Double longitud;
    Double peso;
    int velocidad = 0;

    // CONSTRUCTORES

    // constructor vacio
    public Coche() {
    }

    // constructor con variables internas
    public Coche(String color, String fabricante, String modelo, Double longitud, Double peso) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.longitud = longitud;
        this.peso = peso;
    }

    // METODOS
    public void acelerar(int velocidad) {
        if (velocidad > 0 && velocidad <= 120) {
            this.velocidad = velocidad + 1;
        }

    }

    // GENERAR UNA CADENA DE TEXTO CON LOS ATRIBUTOS
    @Override
    public String toString() {
        return "Coche [color=" + color + ", fabricante=" + fabricante + ", longitud=" + longitud + ", modelo=" + modelo
                + ", peso=" + peso + ", velocidad=" + velocidad + "]";
    }

}
