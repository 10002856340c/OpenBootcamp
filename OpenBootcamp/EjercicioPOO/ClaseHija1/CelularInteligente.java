package OpenBootcamp.EjercicioPOO.ClaseHija1;

import OpenBootcamp.EjercicioPOO.ClasePadre.AparatoInteligente;

public class CelularInteligente extends AparatoInteligente {

    protected String Camara;
    protected String Calculadora;
    protected String RedesSociales;
    protected String MeoriaRam16gb;
    protected String Procesadorparajuegos;
    protected String Linterna;

    public CelularInteligente() {

    }

    public CelularInteligente(String camara, String calculadora, String redesSociales, String meoriaRam16gb,
            String procesadorparajuegos, String linterna) {
        Camara = camara;
        Calculadora = calculadora;
        RedesSociales = redesSociales;
        MeoriaRam16gb = meoriaRam16gb;
        Procesadorparajuegos = procesadorparajuegos;
        Linterna = linterna;
    }

    public CelularInteligente(double nFC, String wife, double bluetooth, String radio, String pantaTouch,
            String bateria, String camara, String calculadora, String redesSociales, String meoriaRam16gb,
            String procesadorparajuegos, String linterna) {
        super(nFC, wife, bluetooth, radio, pantaTouch, bateria);
        Camara = camara;
        Calculadora = calculadora;
        RedesSociales = redesSociales;
        MeoriaRam16gb = meoriaRam16gb;
        Procesadorparajuegos = procesadorparajuegos;
        Linterna = linterna;
    }

    @Override
    public String toString() {
        return "CelularInteligente [Calculadora=" + Calculadora + ", Camara=" + Camara + ", Linterna=" + Linterna
                + ", MeoriaRam16gb=" + MeoriaRam16gb + ", Procesadorparajuegos=" + Procesadorparajuegos
                + ", RedesSociales=" + RedesSociales + "]";
    }

}
