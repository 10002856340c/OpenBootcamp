package TiposdeDatos;

public class TiposdeDatos {

    public static void main(String[] args) {

        // TIPOS DE DATOS EN JAVA
        // ----------------------------------------------------------------------------------------------------------------------------//
        // ENTEROS {

        // *) byte --> Representa un tipo de dato de 8 bits con signo. De tal manera que
        // puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).
        // EJEMPLO:
        byte numero1 = 1; // 1 byte de alamacenamiento en la memoria
        // -------------------------------------------------------------------------------------------//
        // *) short --> El tipo de datos short es un entero de complemento de dos
        // formado por 16 bits. De forma similar al byte, use short para guardar en
        // memoria arrays grandes, en situaciones donde el ahorro de memoria realmente
        // importa.
        // EJEMPLO:
        short numero2 = 2; // 2 bytes de almacenamiento en la memoria
        // -------------------------------------------------------------------------------------------//
        // *) int --> Es un entero de complemento de dos formado de 32 bits.
        // EJEMPLO:
        int numeros3 = 3; // 4 bytes de alamacenamiento en la memoria
        // -------------------------------------------------------------------------------------------//
        // *) long -->El tipo de datos long es un entero de complemento de dos de 64
        // bits.
        // EJEMPLO:
        long numero4 = 4L; // 8 bytes de almacenamiento en la memoria

        // }
        // -----------------------------------------------------------------------------------------------------------------------------//
        // PUNTO FLOTANTE{

        // *) Float --> El tipo de dato float es una coma flotante IEEE 754 de precisión
        // simple de 32 bits. Use float (en lugar double) si necesita guardar en memoria
        // grandes arrays de números de coma flotante.
        // EJEMPLO:
        float decimal1 = 4.9f; // 32 bists

        // -----------------------------------------------------------------------------------------------//
        // *) Double --> El tipo de dato double es una comna flotante IEEE 754 de 64
        // bits de doble precisión. Para valores decimales, este tipo de datos
        // generalmente es la opción predeterminada.
        // EJEMPLO:
        double decimal2 = 5.69d;
        // }
        // -------------------------------------------------------------------------------------------//
        // CARACTER{
        // --> Char -->El tipo de datos char es un simple carácter Unicode de 16 bits.
        // Un char es un solo carácter.se utliza con comillas simples
        // EJEMPLO :
        char variable1 = 'a';
        // }
        // -----------------------------------------------------------------------------------------------------------------------------//

        // BOOLEANOS {
        // boolean --> El tipo de datos booleano representa solo un bit de información:
        // true (verdadero) o false (falso).
        // EJEMPLO :
        boolean verdadero = true;
        boolean falso = false;

        // }
        // -----------------------------------------------------------------------------------------------------------------------------//
        // CADENAS DE TEXTO{
        // String --> Almacenan una cadena de texto , con comillas dobles
        // EJEMPLO:
        String saludo = "Hola Mundo";
        // }
        // -----------------------------------------------------------------------------------------------------------------------------//
        // TIPOS ENVOLTORIO{
        // Integer --> El tipo de datos INTEGER contiene un número entero con un formato
        // de complemento a dos de 64 bits.

        // Long -->El tipo de datos long se utiliza para contener el número entero más
        // grande que int no puede contener

        // EJEMPLO:

        Integer numero = null;
        Long variable = 2L;

        // }
        // -----------------------------------------------------------------------------------------------------------------------------//
    }

}
