package ej2;

public class Empleado {
    private String nombre;

    private Empleado supervisor;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarSupervisor(Empleado supervisor){
        this.supervisor = supervisor;
    }

    public String obtenerNombreSupervisor(){
        if (this.supervisor == null){
            return "Sin supervisor";
        }else{
            return this.supervisor.getNombre();
        }
    }
}
