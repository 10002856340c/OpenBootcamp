package TiposdeMetodos;

public class Metodo3 {
    public static void main(String[] args) {
        /*
         * Opcion 3:
         * Estos tipos de metodos o de funciones no tienen parametros pero nos puede
         * devolver algun "valor"
         * un ejemplo podria hacer alguna informacion de una base de datos o algun
         * numero en especifico o algun valor
         * para esto se hace por medio del metodo get
         * es importante aclarar que estos tipos de metodos se recomiendan almacenarlos
         * en una variable
         * importante tambien tener en cuenta que se debe inicializar el tipo de dato
         * que se quiere retornar
         */

        double devolucion = getRetorno();
        System.out.println(devolucion);
    }

    static double getRetorno() {
        return 100.2;
    }

}
