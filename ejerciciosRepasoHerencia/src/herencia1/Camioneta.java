package herencia1;

public class Camioneta extends Coche{

    private double carga;

    public Camioneta() {
    }

    public Camioneta(String color, int ruedas, double velocidad, int cilindrada, double carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Color: " + this.getColor() + ", ruedas: " + this.getRuedas() + ", velocidad maxima: " + this.getVelocidad() + ", cilindrada: " + this.getCilindrada() + ", carga: " + carga;
    }
}
