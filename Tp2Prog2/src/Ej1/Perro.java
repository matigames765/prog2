package Ej1;

public class Perro extends Animal{

    private String raza;

    private boolean vacunado;

    public Perro(String nombre, int edad, String tipoAnimal, double precio, String raza, boolean vacunado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    void Alimentar(String nombre) {
        System.out.println("Alimentando al perro");
    }

    @Override
    public String toString() {
        String vacunacion;
        if (vacunado == true){
            vacunacion = "si";
        }else{
            vacunacion = "no";
        }
        return "Nombre: " + this.getNombre() + ", Edad: " + this.getEdad() + ", Tipo de animal: " + this.getTipoAnimal() + ", Precio: " + this.getPrecio() + ", Raza: " + raza + ", Vacunado: " + vacunacion;
    }
}
