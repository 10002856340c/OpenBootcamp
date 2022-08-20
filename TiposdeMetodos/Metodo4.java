package TiposdeMetodos;

public class Metodo4 {
    public static void main(String[] args) {
        /*
         * Opcion 4
         * funcion con parametros y sin tipo de retorno
         * En este caso este metodo tiene un parametro pero no retorna ningun valor,
         * el parametro es entrar algun valor del tipo String
         *
         */
        imprimirSludo("Hello");

        /*
         * /
         * Tambien crear varias formas de hacerlo con una sola misma funcion
         */
        suma(10, 5);
        suma(12.6, 15.6);
    }

    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    private static void imprimirSludo(String saludo) {
        System.out.println("buenas tardes " + saludo);
    }

}
