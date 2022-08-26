package OpenBootcamp.EjercicioPOO.ClasePadre;

public class AparatoInteligente {
    protected double NFC;
    protected String Wife;
    protected double Bluetooth;
    protected String Radio;
    protected String PantaTouch;
    protected String Bateria;

    public AparatoInteligente() {
    }

    public AparatoInteligente(double nFC, String wife, double bluetooth, String radio, String pantaTouch,
            String bateria) {
        NFC = nFC;
        Wife = wife;
        Bluetooth = bluetooth;
        Radio = radio;
        PantaTouch = pantaTouch;
        Bateria = bateria;
    }

}
