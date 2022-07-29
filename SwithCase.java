package OpenBootcamp;

import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {

        // 1 ejemplo
        var Estado = "Verano";

        switch (Estado) {
            case "Otoño":
                System.out.println("no es un dia para salir");
                break;
            case "invierno":
                System.out.println("hay que tomar chocolate caliente");
                break;
            case "Verano":
                System.out.println("a pasaear y ir a piscina");
                break;

        }
        // 2 ejemplo
        Scanner usuario = new Scanner(System.in);
        System.out.println("ingresa un sueldo :");
        int sueldo = 1000;
        switch (sueldo) {
            case 1000:
                System.out.println("es un sueldo alto");
                break;
            default:
                System.out.println("es un sueldo bajo");
                break;

        }

    }

}
