package OpenBootcamp.Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<>(Arrays.asList());

    // metodo guardar
    public void guardar(Empleado empleado) {
        empleados.add(empleado);

    }

    // metodo ver
    public List<Empleado> ver() {

        return empleados;

    }

}
