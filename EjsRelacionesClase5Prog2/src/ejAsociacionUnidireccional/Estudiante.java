package ejAsociacionUnidireccional;

public class Estudiante {

    private String nombre;

    private Universidad universidad;

    public Estudiante() {
    }

    public Estudiante(String nombre, Universidad universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
