package herencia2;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String genero, String raza) {
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
        System.out.println("Perro ladrando");
    }

    public void informacion(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Raza: " + raza);
    }
}
