package OpenBootcamp;

public class Main {
    public static void main(String[] args) {
        persona Persona = new persona();
        Persona.setEdad(18);
        Persona.setNombre("Cristian");
        Persona.setTelefono(3152423);
        System.out.println("La edad de la persona es  :" + Persona.getEdad());
        System.out.println("el nombres de la persona es :" + Persona.getNombre());
        System.out.println("el Telefono de la persona es :" + Persona.getTelefono());

    }

}
