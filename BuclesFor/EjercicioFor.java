package BuclesFor;

public class EjercicioFor {
    public static void main(String[] args) {

        String[] Nombres = { "Cristian", "- Carolina", "- Brayan", "- Daniel" };

        for (int i = 0; i <= Nombres.length; i++) {
            /*
             * para que el texto se vea concatenado a la hora de imprimirlo le quitamos el
             * println por --> print, para que no haga salto de linea
             */

            System.out.print(Nombres[i]);
        }

    }
}
