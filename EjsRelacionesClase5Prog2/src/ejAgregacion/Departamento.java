package ejAgregacion;
import java.util.ArrayList;

public class Departamento {

    private ArrayList<Empleado> empleados;

    private String nombre;

    public Departamento() {
    }

    public Departamento(ArrayList<Empleado> empleados, String nombre) {
        this.empleados = new ArrayList<>();
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }
}
