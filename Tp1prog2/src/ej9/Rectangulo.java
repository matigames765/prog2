package ej9;

public class Rectangulo extends FiguraGeometrica{

    private double longitud;

    private double anchura;

    public Rectangulo() {
    }

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    @Override
    double calcularArea() {
        return longitud * anchura;
    }

    @Override
    double calcularPerimetro() {
        return (2 * longitud) + (2 * anchura);
    }
}
