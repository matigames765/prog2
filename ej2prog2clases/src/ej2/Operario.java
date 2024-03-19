package ej2;

public abstract class Operario extends Empleado {
    private String edad;

    public Operario() {
    }

    public Operario(String nombre, String edad) {
        super(nombre);
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return edad + " " + this.getNombre();
    }

    public void identidad(){
        System.out.println("Soy un operario");
    }
}
