package ej2;

public class Directivo extends Empleado{
    private String oficina;

    public Directivo() {
    }

    public Directivo(String nombre, String oficina) {
        super(nombre);
        this.oficina = oficina;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    @Override
    public String toString() {
        return oficina + " " + this.getNombre();
    }

    public void identidad(){
        System.out.println("Soy un directivo");
    }
}
