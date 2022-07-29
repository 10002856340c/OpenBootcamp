package OpenBootcamp;

import java.util.Scanner;

public class DesafioWhile_y_doWhile {
    public static void main(String[] args) {
        // 1 punto
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int numero = usuario.nextInt();
        if (numero == 0) {
            System.out.println("el numero ingresado es 0");
        } else if (numero < 0) {
            System.out.println("el numero ingresado es negativo");
        } else if (numero > 0) {
            System.out.println("el numero ingresado es positivo");
        }

        // 2 punto
        System.out.println("ingresa otro numero :");
        int numeroWhile = usuario.nextInt();
        while (numeroWhile < 3 || numeroWhile == 0) {
            numeroWhile += 1;
            System.out.println(numeroWhile);
        }

        // 3 punto

        System.out.println("ingresa otro numero :");
        int numeroDowhile = usuario.nextInt();
        do {

            System.out.println(numeroDowhile);
            numeroDowhile += 1;

        } while (numeroDowhile < 3);

        // 4 punto

    }

}
