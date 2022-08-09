package OpenBootcamp.POO;

public class Poliformismo {

    public static void main(String[] args) {

        Coche coche1 = new Coche();

        // Poliformismo
        Coche coche4 = new CocheElectrico();

        if (coche4 instanceof CocheElectrico) {
            System.out.println("coche electrico");
        }

    }

}
