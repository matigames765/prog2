package ej;

public class Cuadrado implements Rotable, Figura, Dibujable{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el cuadrado...");
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el cuadrado...");

    }
}
