package OpenBootcamp;

public class Sentencias_Break_Continue {
    public static void main(String[] args) {
        int numero = 1;
        int numero2 = 1;

        // EJEMPLO 1:
        while (numero < 10) {
            numero++; // 1 Funcion que va hacer
            System.out.println(" Hello World" + numero); // 2 Funcion que va hacer

            if (numero == 5) // Va a mirar esta condicion
                break; // Rompre el flujo de ejecucion del bucle y termina el programa o
            // "bucle"
            // continue; // Salta el valor a 6 y "Continua" a la siguiente iteracion o
            // bloque de codigo

            System.out.println("Has llegado al fin del bucle felicitaciones !!");

        }

    }
}
