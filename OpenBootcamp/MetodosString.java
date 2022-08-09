package OpenBootcamp;

public class MetodosString {

    public static void main(String[] args) {
        // metodos string
        /*
         * length()
         * starsWith()
         * indexOf()
         * subString()
         * trim()
         * equals()
         * compareto
         * toUpperCase()
         * toLowerCase();
         * equals()
         * equalsIgnoreCase()
         */

        String palabra = "  hola  ";
        // Ejemplo length
        System.out.println(palabra.length());
        // Ejemplo toUpperCase
        System.out.println(palabra.toUpperCase());
        // Ejemplo trim()
        System.out.println(palabra.trim());

        // Ejemplo de equals (TIENEN QUE SER COMPLETAMENTE IGUALES)
        String palabra1 = "HOLA COMO ESTAS";
        String palabra2 = "hola como estas";

        if (palabra1.equals(palabra2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("no son iguales");
        }
        // Ejemplo de equalsIgnoreCase (ignora si son en minusculas o mayusculas)
        String palabra3 = "HOLA COMO ESTAS";
        String palabra4 = "hola como estas";

        if (palabra3.equalsIgnoreCase(palabra4)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("no son iguales");
        }
    }

}
