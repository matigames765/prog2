package ejAsociacionBidireccional;

import java.util.ArrayList;


public class Persona {

    private String nombre;

    private ArrayList<Libro> libros;

    public Persona() {
    }

    public Persona(String nombre, Libro[] libros) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibros(Libro libro){
        libros.add(libro);
        libro.agregarPersonas(this);
    }
}
