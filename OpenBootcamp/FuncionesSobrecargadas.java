package OpenBootcamp;

public class FuncionesSobrecargadas {

    // CARACTERISTICAS A TENER EN CUENTA

    // 1)para hacer sobrecarga de funciones o metodos no importa si el nombre del
    // metodo es igual a la hora de estanciarlos en el main

    // 2) para hacer que nuestro metodo o funcion se llame igual y no presente
    // problema a la hora de instanciarlo en el Main tenemos que asignarle las
    // variable internas ya sea por el numero de variables , o por el tipo de
    // variable que se quiere retornar para que java sepa diferenciarlos y no
    // "piense que estamos haciendo la misma funcion dos veces"

    public static void main(String[] args) {

        // Las funciones en la clase main se deben llamar para poder ejecutar el
        // programa
        FuncionMatematica();
        System.out.println(FuncionMatematica(5, 4));
        System.out.println(FuncionMatematica(10.5, 3.4));
        FuncionMatematica("Hello world");

    }

    // Esta funcion se llama igual a las demas pero se DIFERENCIA por que es de tipo
    // void
    private static void FuncionMatematica() {
        System.out.println("Funcion Matematica");
    }

    // Esta funcion se llama igual a las demas pero se DIFERENCIA por que es de tipo
    // int y las variable internas son dos y son de tipo int
    private static int FuncionMatematica(int numero1, int numero2) {
        int Suma = numero1 + numero2;
        return Suma;
    }

    // Esta funcion se llama igual a las demas pero se DIFERENCIA por que es de tipo
    // double y las variable internas son dos y son de tipo double
    private static double FuncionMatematica(double numero1, double numero2) {
        double Division = numero1 / numero2;
        return Division;

    }

    // Esta funcion se llama igual a las demas pero se DIFERENCIA por que es de tipo
    // String y tiene una variable interna que es tipo String
    private static String FuncionMatematica(String saludoString) {
        return saludoString;
    }

}
