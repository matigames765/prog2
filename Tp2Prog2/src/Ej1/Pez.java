package Ej1;

public class Pez extends Animal{

    private String habitat;

    private boolean venenoso;

    public Pez(String nombre, int edad, String tipoAnimal, double precio, String habitat, boolean venenoso) {
        super(nombre, edad, tipoAnimal, precio);
        this.habitat = habitat;
        this.venenoso = venenoso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    void Alimentar(String nombre) {
        System.out.println("Alimentando al pez");
    }

    @Override
    public String toString() {
        String veneno;
        if (venenoso == true){
            veneno = "si";
        }else{
            veneno = "no";
        }
        return "Nombre: " + this.getNombre() + ", Edad: " + this.getEdad() + ", Tipo de animal: " + this.getTipoAnimal() + ", Precio: " + this.getPrecio() + ", Habitat: " + habitat + ", Venenoso: " + veneno;
    }
}
