package OpenBootcamp;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 1;
        int con = 0;
        int acu = 0;
        int num = 0;
        int num2 = 0;

        System.out.println("¿Cuántos números va a ingresar?");
        num = entrada.nextInt();

        while (numero <= num) {
            System.out.println("Por favor digite el numero: ");
            num2 = entrada.nextInt();
            con = con + 1;
            acu = acu + num2;

            System.out.println("El " + numero + " número ingresado es: " + num2);
            numero++;
        }
        System.out.println("********************************************************* ");
        System.out.println("La cantidad de números ingresados son: " + con);
        System.out.println("********************************************************* ");
        System.out.println("La suma de números ingresados es: " + acu);
    }
}
