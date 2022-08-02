package OpenBootcamp;

public class persona {
    private int Edad;
    private int telefono;
    private String nombre;

    public persona() {

    }

    public persona(int edad, int telefono, String nombre) {
        this.Edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

    

    

    