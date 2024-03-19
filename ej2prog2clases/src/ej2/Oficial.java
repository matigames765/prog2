package ej2;

public class Oficial extends Operario{
    private int nroPlaca;

    public Oficial() {
    }

    public Oficial(String nombre, String edad, int nroPlaca) {
        super(nombre, edad);
        this.nroPlaca = nroPlaca;
    }

    public int getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(int nroPlaca) {
        this.nroPlaca = nroPlaca;
    }

    @Override
    public String toString() {
        return nroPlaca + " " + this.getEdad() + " " + this.getNombre();
    }

    @Override
    public void identidad() {
        System.out.println("Soy un oficial");;
    }

    public void hobbie(){
        System.out.println("Me justa jugar al futbol");
    }
}
