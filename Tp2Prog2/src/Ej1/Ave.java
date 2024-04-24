package Ej1;

public class Ave extends Animal{

    private String especie;

    private boolean habla;

    public Ave(String nombre, int edad, String tipoAnimal, double precio, String especie, boolean habla) {
        super(nombre, edad, tipoAnimal, precio);
        this.especie = especie;
        this.habla = habla;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    @Override
    void Alimentar(String nombre) {
        System.out.println("Alimentando al ave");
    }

    @Override
    public String toString() {
        String comunicacion;
        if (habla == true){
            comunicacion = "si";
        }else{
            comunicacion = "no";
        }
        return "Nombre: " + this.getNombre() + ", Edad: " + this.getEdad() + ", Tipo de animal: " + this.getTipoAnimal() + ", Precio: " + this.getPrecio() + ", Especie: " + especie + ", Habla: " + comunicacion;
    }
}
