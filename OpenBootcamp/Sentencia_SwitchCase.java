package OpenBootcamp;

import java.util.Scanner;

public class Sentencia_SwitchCase {
    // CARACTERISTICAS A TENER EN CUENTA

    // *) Cuando se alcanza la sentencia switch, se evalúa la expresión. El
    // resultado se compara con cada <valor> consecutivamente, hasta encontrar uno
    // que coincida. Cuando coincide un <valor>, se ejecutan las instrucciones de
    // esa cláusula y todas las de las cláusulas que le siguen.

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("ingrese una estacion del año :");
        String estacion = usuario.nextLine();
        // Entra a la sentencia
        switch (estacion) {
            // evalua si el caso es verdadero, si cumple el caso ejecuta la funcion que este
            // dentro del case
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
