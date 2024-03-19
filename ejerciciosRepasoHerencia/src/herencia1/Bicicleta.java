package herencia1;

public class Bicicleta extends Vehiculo {

    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Color: " + this.getColor() + ", ruedas: " + this.getRuedas() + ", tipo: " + tipo;
    }
}
