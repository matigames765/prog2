package herencia2;

public class Pajaro extends Animal{
    private String especie;

    public Pajaro(String nombre, int edad, String genero, String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void hacer_sonido() {
        System.out.println("Pajaro trinando");
    }

    public void informacion(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Especie: " + especie);
    }
}
