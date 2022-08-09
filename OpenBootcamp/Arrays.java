package OpenBootcamp;

public class Arrays {

    public static void main(String[] args) {
        // como se crea un array, inicializando su tipo int, double, string

        // 1) Ejemplo
        String[] array = new String[] { "cristian", "camilo", "oscar" };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // 2) Ejemplo
        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, };

        for (int z = 0; z < numeros.length; z++) {
            System.out.println(numeros[z]);
        }
    }

}
