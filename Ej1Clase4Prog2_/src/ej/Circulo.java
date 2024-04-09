package ej;

public class Circulo implements Figura, Dibujable{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el circulo...");
    }

    @Override
    public double area() {
        return (3.14 * radio * radio);
    }
}
