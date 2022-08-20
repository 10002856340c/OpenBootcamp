package TiposdeMetodos;

public class Metodos1 {
    public static void main(String[] args) {
        /*
         * Opcion 1:
         * Funcion o metodo sin parametros y sin tipo de retorno , en este caso
         * utilizamos
         * "void"
         * 
         */
        saludar();
        saludar();
        System.out.println("-------------------------------------------------------------\n");
        despedirme();
        despedirme();

    }

    static void saludar() {
        System.out.println("hola");
        System.out.println("como estas");
        System.out.println("Espero que estes bien ");

    }

    static void despedirme() {
        System.out.println("chao");
        System.out.println("espero que estes bien");
        System.out.println("buen dia  ");

    }

}
