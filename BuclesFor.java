package OpenBootcamp;

public class BuclesFor {

    // CARACTERISTICA A TENER EN CUENTA

    // 1) Condición de inicialización: Aquí, inicializamos la variable en uso. Marca
    // el inicio de un ciclo for. Se puede usar una variable ya declarada o se puede
    // declarar una variable, solo local para el bucle.

    // 2) Condición de prueba: se usa para probar la condición de salida de un
    // bucle.Debe devolver un valor booleano. También es un bucle de control de
    // entrada cuando se verifica la condición antes de la ejecución de las
    // instrucciones de bucle.

    // 3) Ejecución de instrucción: una vez que la condición se evalúa como
    // verdadera, se ejecutan las instrucciones en el cuerpo del bucle.
    // Incremento/Decremento: se usa para actualizar la variable para la siguiente
    // iteración.

    // 4)Terminación de bucle: cuando la condición se vuelve falsa, el bucle termina
    // marcando el final de su ciclo de vida.
    public static void main(String[] args) {
        // FOR --> por cada

        // 1 ) Ejemplo

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
