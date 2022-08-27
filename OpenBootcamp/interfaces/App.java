package OpenBootcamp.Interfaces;

import java.util.List;

public class App {
    public static void main(String[] args) {
        EmpleadoCRUD empleadocrud = new EmpleadoCRUD();
        Empleado empleado1 = new Empleado("Cristian", "Galeano", 1000256340, true);
        Empleado empleado2 = new Empleado("Fabian", "Pulido", 112566340, true);
        Empleado empleado3 = new Empleado("Daniel", "Forero", 1256956340, true);
        empleadocrud.guardar(empleado1);
        empleadocrud.guardar(empleado2);
        empleadocrud.guardar(empleado3);
        List<Empleado> empleados = empleadocrud.ver();
        System.out.println(empleados);
    }
}
