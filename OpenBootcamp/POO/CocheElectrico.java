package OpenBootcamp.POO;

public class CocheElectrico extends Coche {

    // Atributo
    String MotorElectrico;

    // Constructores

    public CocheElectrico() {

    }

    public CocheElectrico(String motorElectrico) {
        MotorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double longitud, Double peso,
            String motorElectrico) {
        super(color, fabricante, modelo, longitud, peso);
        MotorElectrico = motorElectrico;
    }

    // GENERAR UNA CADENA DE TEXTO CON LOS ATRIBUTOS

    @Override
    public String toString() {
        return "Coche [color=" + color + ", fabricante=" + fabricante + ", longitud=" + longitud + ", modelo=" + modelo
                + ", peso=" + peso + ", velocidad=" + velocidad + "motor" + MotorElectrico + "]";
    }

}
