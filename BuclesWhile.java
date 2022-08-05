package OpenBootcamp;

public class BuclesWhile {

    // CARACTERISTICAS A TENER EN CUENTA:

    // *)El while comienza con la verificación de la condición. Si se evalúa como
    // verdadero, las instrucciones del cuerpo del bucle se ejecutan; de lo
    // contrario, se ejecuta la primera instrucción que le sigue al bucle. Por esta
    // razón, también se llama bucle de control de entrada.

    // *) Una vez que la condición se evalúa como verdadera, se ejecutan las
    // instrucciones en el cuerpo del bucle.

    // *) Normalmente, las declaraciones contienen un valor de actualización para
    // la variable que se procesa para la siguiente iteración.

    // *) Cuando la condición se vuelve falsa, el ciclo finaliza y marca el final
    // de su ciclo de vida.
    public static void main(String[] args) {
        // WHILE --> mientras

        // Ejemplo:

        int numero = 10;

        // mientras se cumpla la condicion de que numero = 10 es menor a 0
        // hazme lo siguiente que en este caso va a imprimir el numero
        while (numero > 0) {
            System.out.println(numero);
            numero -= 1;
        }

    }
}
