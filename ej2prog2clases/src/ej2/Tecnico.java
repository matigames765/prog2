package ej2;

public class Tecnico extends Operario{
    private String especialidad;

    public Tecnico() {
    }

    public Tecnico(String nombre, String edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return especialidad + " " + this.getNombre() + " " + this.getEdad();
    }

    @Override
    public void identidad() {
        System.out.println("Soy un tecnico");;
    }

    public void hobbie(){
        System.out.println("Me gusta jugar al tenis");
    }
}
