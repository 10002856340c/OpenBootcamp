package OpenBootcamp;

public class App {
    public static void main(String[] args) {
        Cliente objeto = new Cliente();
        Trabajador objeto2 = new Trabajador();
        objeto.setCredito(true);
        objeto.setEdad(19);
        objeto.setTelefono(3064452);
        objeto.setNombre("Cristian Smith");
        objeto2.setSalario(2000);

        System.out.println("El señor " + objeto.getNombre() + " tiene " + objeto.getEdad() + " años y su telefono es "
                + objeto.getTelefono() + " y su nivel crediticio es " + objeto.isCredito()
                + " y el salario neto mensual es de " + Math.round(objeto2.getSalario()) + " dolares");

    }

}
