package OpenBootcamp;

public class Bucles {
    public static void main(String[] args) {
        int numero = 10;

        // mientras se cumpla esta condicion
        // hazme lo siguiente
        while (numero > 0) {
            System.out.println(numero);

            numero -= 1;
        }
        // -------------------------------------------------------------------------------------------------------------------//

        // 1 ) Ejemplo
        // por cada
        // 1--> Creamos la variable
        // 2--> creamos la condicion para que se ejecute el bucle
        // 3--> creamos el codigo que queremos que haga cada vez que se cumpla la
        // condicion dentro del bucle
        for (int numeros = 1; numeros != 10; numeros += 1) {
            System.out.println(numeros);
        }

        // 2) Ejemplo
        // ejemplo para crear un array o una lista vacia de 5 elementos
        // int array[] = new int[5];
        // ejemplo para crear un array
        int array2[] = { 10, 20, 50, 30, 50 };
        // 0<5 true
        // 1<5 true
        // 2<5 true
        // 3<5 true
        // 4<5 true
        // 5<5 false --> para ! el bucle
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }

}
