package OpenBootcamp.EjercicioPOO;

import OpenBootcamp.EjercicioPOO.ClaseHija1.CelularInteligente;
import OpenBootcamp.EjercicioPOO.ClaseHija2.RelojInteligente;
import OpenBootcamp.EjercicioPOO.ClasePadre.AparatoInteligente;

public class App {
    public static void main(String[] args) {
        CelularInteligente celular = new CelularInteligente(1.36, "Si", 2.6, "Si", "Si", "Si", "Si", "Si", "Si", "Si",
                "Si", "Si");
        RelojInteligente reloj = new RelojInteligente(1.20, "Si", 2.2, "No", "Si", "Si", "Si", "No", "Si", "Si", "Si",
                "Si");

        System.out.println(celular + "\n");

        System.out.println(reloj);

    }

}
