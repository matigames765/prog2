package Ej1;

public class Gato extends Animal{

    private boolean estirilizado;

    private String raza;

    public Gato(String nombre, int edad, String tipoAnimal, double precio, boolean estirilizado, String raza) {
        super(nombre, edad, tipoAnimal, precio);
        this.estirilizado = estirilizado;
        this.raza = raza;
    }

    public boolean isEstirilizado() {
        return estirilizado;
    }

    public void setEstirilizado(boolean estirilizado) {
        this.estirilizado = estirilizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    void Alimentar(String nombre) {
        System.out.println("Alimentando al gato");
    }

    @Override
    public String toString() {
        String estirilizacion;
        if (estirilizado == true){
            estirilizacion = "si";
        }else{
            estirilizacion = "no";
        }
        return "Nombre: " + this.getNombre() + ", Edad: " + this.getEdad() + ", Tipo de animal: " + this.getTipoAnimal() + ", Precio: " + this.getPrecio() + ", Raza: " + raza + ", Estirilizado: " + estirilizacion;
    }
}
