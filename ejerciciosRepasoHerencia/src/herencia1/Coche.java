package herencia1;

public class Coche extends Vehiculo {

    private double velocidad;
    private int cilindrada;

    public Coche() {
    }


    public Coche(String color, int ruedas, double velocidad , int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Color: " + this.getColor() + ", ruedas: " + this.getRuedas() + ", velocidad maxima: " + velocidad + ", cilindrada: " + cilindrada;
    }
}
