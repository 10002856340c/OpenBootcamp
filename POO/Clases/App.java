package POO.Clases;

public class App {
    public static void main(String[] args) {
        Mercedez mercedez = new Mercedez("Mercedez", "DFRZX", 1000256340, 2021, 350.0);
        BMW bmw = new BMW("BMW", "234XZW", 1000369875, 2022, 365.0);

        System.out.println("El carro " + mercedez.Fabricante + " de modelo " + mercedez.Modelo + "\n"
                + "el propietario de numero de cedula " + mercedez.cc + "\n" + " el año de vehiculo es " + mercedez.year
                + " con una velocidad de :" + mercedez.velocidad + "\n");

        System.out.println("El carro " + bmw.Fabricante + " de modelo " + bmw.Modelo + "\n"
                + "el propietario de numero de cedula " + bmw.cc + "\n" + " el año de vehiculo es " + bmw.year
                + " con una velocidad de :" + bmw.velocidad);
    }
}
