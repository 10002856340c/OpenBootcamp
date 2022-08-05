package OpenBootcamp;

public class Condicionales_If_Else {
    // CARACTERISTICAS A TENER EN CUENTA

    // IF --> La estructura condicional más simple en Java es el if, se evalúa una
    // condición y en caso de que se cumpla se ejecuta el contenido entre las llaves
    // {} o en caso de que se omitan se ejecuta el código hasta el primer «;» por lo
    // tanto si no se usan los {} la condición aplica solo a la siguiente
    // instrucción al if.
    // ------------------------------------------------------------------------------------------------//
    // IF ELSE --> funciona para hacer el "else" condicional añadiendo un if
    // para que si no se cumple la primera condición (la del if principal) se evalue
    // esta nueva condición de modo que se puede concatenar la cantidad de if else
    // que se necesiten para cubrir todos los distintos escenarios que precisen ser
    // tratados de una forma particular, siendo el ultimo else el que se ejecute
    // cuando no se cumpla ninguna condición (el else es siempre opcional).
    // ------------------------------------------------------------------------------------------------//
    // IF por si no ELSE --> funciona practicamente por si no se llega a cumplir la
    // primira condicion principal if se ejecute el else por alternancia
    // ------------------------------------------------------------------------------------------------//

    // OPERADORES LOGICOS, RELACION,COMPARACION,BOOLEANOS

    // Los operadores lógicos se usan para combinar dos valores Booleanos y devolver
    // un resultado verdadero, falso o nulo. Los operadores lógicos también se
    // denominan operadores Booleanos. Devuelve True cuando Expresión1 y Expresión2
    // son verdaderas. Devuelve True cuando Expresión1 o Expresión2 es verdadera.
    // EJEMPLO:

    // *) > --> Mayor a
    // *) < --> Menor a
    // *) >= --> Mayor o igual a
    // *) <= --> Menor o igual a
    // *) == --> Igual a
    // *) != --> Diferente a
    // *) && --> and
    // *) | | --> or
    // *) ! --> negacion
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;
        int numero3 = 6;
        int numero4 = 7;
        // esta primera condicion tiene un if principal, y un operador and && , en el
        // cual
        // significa que se deben cumplir las dos condiciones
        if (numero1 > numero4 && numero3 < numero4) {
            System.out.println("Se cumple la primera Condicion");
            // Aletrnativamente ponemos otra condicion opcional por si no se llega a cumplir
            // la primera con los mismos operadores &&
        } else if (numero2 < numero1 && numero4 > numero1) {
            System.out.println("Se ha cumplido la segunda Condicion");
        }

        // este segunda condicion tiene un if principal con un operador or | | , para
        // que alguna de las dos condiciones se llega a cumplir
        if (numero4 >= numero2 || numero3 <= numero4) {
            System.out.println("Se ha cumplido la tercera Condicion");
            // si la primera condicion principal if no se llega a cumplir , el else se
            // cumple por defecto
        } else {
            System.out.println("No se ha cumplido ninguna funcion");
        }

    }

}
