package Throw;

//creamos un metodo   que va a heredar de una clase que esta en el kit JDK de java que se llama 
// RuntimeException , el cual es un error que se puede llegar a generar cuando se depure o se corra el codigo
public class Excepsiones extends ArithmeticException {
    // en este caso este metodo va a generar un mensaje
    public Excepsiones(String mensaje) {
        super(mensaje);
    }

}
