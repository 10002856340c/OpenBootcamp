package OpenBootcamp;

public class Funciones {

    // CARACTERISTICAS A TENER EN CUENTA :

    // 1) Las funciones de tipo Void , son aquellas funciones que no retornan
    // ningun valor

    // 2) Cuando nosotros queremos crear una funcion que nos retorne algun valor
    // debemos inicializar el valor que le vamos a devolver ya sea un valor string,
    // int, double, boolean etc

    // 3) Las funciones privates (private) solo puden ser instanciadas dentro del
    // main de esa misma clase

    // 4)Las funciones publicas (public) pueden ser instanciadas en otra clase main
    // sin importar que esten en el mismo package

    // 6) Las funciones protegidas (protected) puedes ser instanciadas en otra
    // clase siempre y cuando esten en el mismo package

    // 5) Una variable estática (static) en Java es una variable que pertenece a la
    // clase en que fue declarada y se inicializa solo una vez al inicio de la
    // ejecución del programa, la característica principal de este tipo de variables
    // es que se puede acceder directamente con el nombre de la clase sin necesidad
    // de crear un objeto

    // 6) Cuando se crea una funcion que va devolver algun valor por ejemplo de tipo
    // int , y le paso valores internos a esa funcion , a la hora de instanciar esa
    // funcion dentro de la clase main se debe poner los valores internos para que
    // se ejecute la funcion

    public static void main(String[] args) {

        // Las funciones en la clase main se deben llamar para poder ejecutar el
        // programa

        FuncionVoid();
        FuncionString("hola");
        FuncionInt(10);
        FuncionSuma(10, 5);

    }

    // Funcion Void
    private static void FuncionVoid() {
        System.out.println("hola esta en la funcion void");
    }

    // Funcion que retorna un string y es privada
    private static String FuncionString(String saludo) {
        return saludo;
    }

    // Funcion que retorna un int y es privada
    private static int FuncionInt(int numero) {
        return numero;
    }

    // Funcion que retorna una operacion matematica , por lo tanto hay que poner los
    // argumentos internos cuando sea instanciada y es privada
    private static int FuncionSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Funcion publica que retorna un boolean y puede ser instanciada en cualquier
    // clase asi no haga parte del package
    public static boolean Racional() {
        return true;

    }

    // Funcion protected que retorna un Double , hay que pasarle algun numero Double
    // para que se ejecute la funcion y solo puede ser instanciada dentro del mismo
    // package
    protected static Double decimales(double numero) {
        return numero;
    }

}
