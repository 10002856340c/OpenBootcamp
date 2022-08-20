package TiposdeMetodos;

public class Metodos2 {
    public static void main(String[] args) {
        /*
         * Opcion 2: este tipo de metodo es el mas conocido y es el que retorna un valor
         * segun el tipo de dato que queramos retornar
         * para eso tenemos que inicializar el tipo de dato en la funcion
         * tambien tenemos que inicializar los variables interna que queremos utilizar
         * cuando estas funciones sean
         * llamadas y toque asignarle un valor
         */
        suma(10, 5);
    }

    private static int suma(int numero1, int numero2) {
        int operacion = numero1 + numero2;
        return operacion;

    }

}
