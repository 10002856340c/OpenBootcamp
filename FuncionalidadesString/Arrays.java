package FuncionalidadesString;

public class Arrays {

    public static void main(String[] args) {
        // como se crea un array, inicializando su tipo int, double, string

        // 1) Ejemplo para recorrer indice por indice y saber las posiciones de los
        // elementos del array
        String[] array = new String[] { "cristian", "camilo", "oscar" };

        for (int i = 0; i < array.length; i++) {
            System.out.println("El nombre " + array[i] + "esta en la posicion" + i);
        }
        // 2) Ejemplo Para recorrer el array pero no podemos acceder a sus indices
        for (String nombre : array) {
            System.out.println(nombre);
        }
        // ------------------------------------------------------------------------------------------------------------------//
        // 1) Ejemplo para recorrer indice por indice y saber las posiciones de los
        // elementos del array
        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, };

        for (int z = 0; z < numeros.length; z++) {
            System.out.println("el numero " + numeros[z] + " esta en el indice del array " + z);
        }

        // 2) Ejemplo Para recorrer el array pero no podemos acceder a sus indices
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

}
