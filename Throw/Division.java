package Throw;

public class Division {

    // creamos un metodo que se va a llamar dividir y va a devolver la division
    // entre los numeros que pueda a llegar a ser

    public static int Dividir(int numero1, int numero2) {
        // creamos una condicion por si llega haber un error comun
        if (numero2 == 0) {
            // creamos una excepcion que en este caso va a ser personalizada
            // es decir vamos a instanciar el metodo excpesiones ("y le pasamos el mensaje
            // ")
            throw new Excepsiones("no se puede dividir por 0");
        }
        // si no se llega a presenta ningun error que divida normalmente los numeros
        return numero1 / numero2;

    }

}
