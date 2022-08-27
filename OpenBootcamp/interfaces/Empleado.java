package OpenBootcamp.Interfaces;

public class Empleado {

    // Atributos
    protected String Nombre;
    protected String Apellidos;
    protected int ID;
    protected boolean ActivoEmpresa;

    public Empleado() {

    }

    public Empleado(String nombre, String apellidos, int iD, boolean activoEmpresa) {
        Nombre = nombre;
        Apellidos = apellidos;
        ID = iD;
        ActivoEmpresa = activoEmpresa;
    }

    @Override
    public String toString() {
        return "Empleado [ActivoEmpresa=" + ActivoEmpresa + ", Apellidos=" + Apellidos + ", ID=" + ID + ", Nombre="
                + Nombre + "]";
    }
}
