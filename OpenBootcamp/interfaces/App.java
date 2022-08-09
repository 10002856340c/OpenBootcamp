package OpenBootcamp.interfaces;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2.20);
        circulo.CalcularArea();
        circulo.toString();
        circulo.dibujar();

    }

}
