package OpenBootcamp;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        // se crea la lista
        List<String> nombres = new ArrayList<>();

        // se agrega los nombres de tipo string a nuestra lista con la funcion add();
        nombres.add("Cristian");
        nombres.add("Camilo");
        nombres.add("Carlos");
        System.out.println(nombres);

        // para recorrer la lista string
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

}
