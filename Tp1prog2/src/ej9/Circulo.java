package ej9;
import java.lang.Math;

public class Circulo extends FiguraGeometrica{

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
    double calcularArea() {
        return Math.PI * Math.pow(radio , 2);
    }

    @Override
    double calcularPerimetro() {
        return Math.PI * 2 * radio;
    }

}
