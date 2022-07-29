package OpenBootcamp;

import java.util.Scanner;

public class Desafio_For {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println("ingrese una estacion del año :");
        var estacion = usuario.nextLine();
        switch (estacion) {
            case "verano":
                System.out.println("has elegido " + estacion);
                break;
            case "otoño":
                System.out.println("has elegido " + estacion);
                break;
            case "invierno":
                System.out.println("has escogido " + estacion);
                break;
            case "primavera":
                System.out.println("has escogido " + estacion);
                break;
        }

    }

}
