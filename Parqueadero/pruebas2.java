package Parqueadero;

import java.util.Scanner;

public class pruebas2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);// Para pedir números por teclado

        int suma = 0;
        int NumeroCarrros = 0;
        int NumeroMotos = 0;
        int NumeroBicicletas = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Bienvenido al sistema ");

            System.out.println("¿Que tipo de automovil va a ingresar al Parqueadero : + \n");
            System.out.println("1 - Carrro");
            System.out.println("2 - Moto");
            System.out.println("3 - Bicicleta");
            NumeroCarrros = reader.nextInt();
            suma = suma + NumeroCarrros;
        }

        System.out.println("El numero de carros ingresado es : " + suma);

    }
}
