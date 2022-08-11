package Throws;

public class App {
    public static void main(String[] args) {
        // inicializamos una variable
        int resultado = 0;

        // hacemos un try cash
        try {
            // reescribimos la variable en el try y almacenamos en la variable la instancia
            // del modulo division con su metodo dividir
            resultado = Division.Dividir(10, 0);

            // si llega haber una exception , que nos muestre cual es la exception
        } catch (Exception e) {

            e.printStackTrace(System.out);// sirve para mostrar explicitamente el error que se puede llegar a presentar
        }
        // al final que nos imprima el resultado
        System.out.println("Resultado " + resultado);

    }

}
