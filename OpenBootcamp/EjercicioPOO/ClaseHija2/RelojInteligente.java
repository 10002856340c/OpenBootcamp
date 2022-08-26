package OpenBootcamp.EjercicioPOO.ClaseHija2;

import OpenBootcamp.EjercicioPOO.ClasePadre.AparatoInteligente;

public class RelojInteligente extends AparatoInteligente {

    protected String Reloj;
    protected String Calculadora;
    protected String TamañoPequeño;
    protected String MeoriaRam3gb;
    protected String ProcesadorPequeño;
    protected String Flexibilidaddeuso;

    public RelojInteligente() {

    }

    public RelojInteligente(String reloj, String calculadora, String tamañoPequeño, String meoriaRam3gb,
            String procesadorPequeño, String flexibilidaddeuso) {
        Reloj = reloj;
        Calculadora = calculadora;
        TamañoPequeño = tamañoPequeño;
        MeoriaRam3gb = meoriaRam3gb;
        ProcesadorPequeño = procesadorPequeño;
        Flexibilidaddeuso = flexibilidaddeuso;
    }

    public RelojInteligente(double nFC, String wife, double bluetooth, String radio, String pantaTouch, String bateria,
            String reloj, String calculadora, String tamañoPequeño, String meoriaRam3gb, String procesadorPequeño,
            String flexibilidaddeuso) {
        super(nFC, wife, bluetooth, radio, pantaTouch, bateria);
        Reloj = reloj;
        Calculadora = calculadora;
        TamañoPequeño = tamañoPequeño;
        MeoriaRam3gb = meoriaRam3gb;
        ProcesadorPequeño = procesadorPequeño;
        Flexibilidaddeuso = flexibilidaddeuso;
    }

    @Override
    public String toString() {
        return "RelojInteligente [Calculadora=" + Calculadora + ", Flexibilidaddeuso=" + Flexibilidaddeuso
                + ", MeoriaRam3gb=" + MeoriaRam3gb + ", ProcesadorPequeño=" + ProcesadorPequeño + ", Reloj=" + Reloj
                + ", TamañoPequeño=" + TamañoPequeño + "]";
    }

}
