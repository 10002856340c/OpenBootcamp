package OpenBootcamp;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

        // para crear un mapa
        // se inicializa los tipos en los cuales se va a trabajar ya sea
        // Double,Integer,String
        Map<Integer, String> personas = new HashMap<>();

        // se agrega la claves y el valor al mapa con la funcion put

        personas.put(1000256340, "Cristian");
        personas.put(1000265340, "Camilo");
        personas.put(1065256369, "Carlos");

        System.out.println(personas);

        // para iterar sobre las key de un map
        for (Integer key : personas.keySet()) {
            System.out.println(key);
        }
        // para iterar sobre los value de un mapa
        for (String Values : personas.values()) {
            System.out.println(Values);
        }
        // para iterar sobre los key y values de un mapa
        for (Map.Entry<Integer, String> keyValue : personas.entrySet()) {
            System.out.println(keyValue.getKey() + " : " + keyValue.getValue());
        }

    }

}
