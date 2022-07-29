package OpenBootcamp;

public class Desafio2 {

    public static void main(String[] args) {
        coche carro = new coche();
        carro.sumapuertas();
        carro.sumapuertas();
        carro.sumapuertas();
        carro.sumapuertas();
        System.out.println("El numero de puertas que tiene el coche es :" + carro.puertas);

    }

}

class coche {
    public int puertas = 0;

    public void sumapuertas() {
        this.puertas++;
    }
}
