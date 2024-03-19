package herencia2;

public class Gato extends Animal{
    private String raza;

    public Gato(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacer_sonido() {
        System.out.println("Gato maullando");
    }

    public void informacion(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Raza: " + raza);
    }
}
