package Throws;

//CARACTERISTICAS A TENER EN CUENTA :

//*La sentencia throw se utiliza para lanzar explícitamente una excepción. En primer lugar se debe obtener un descriptor de un objeto Throwable, bien mediante un parámetro en una cláusula catch o, se puede crear utilizando el operador new. */

//este ejemplo se trata de hacer excepciones al dividir entre 0
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
