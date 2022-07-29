package OpenBootcamp;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Escoje un numero :");
        int numero = usuario.nextInt();

        if (numero == 5) {
            System.out.println("Bingoooo!!!");
        } else if (numero == 4) {
            System.out.println("Estuviste cerca!!!!");

        } else {
            System.out.println("mejor vete");
        }

    }

}
