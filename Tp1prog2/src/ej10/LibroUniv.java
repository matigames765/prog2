package ej10;

public class LibroUniv extends Libro{

    private String facultad;

    public LibroUniv() {
    }

    public LibroUniv(String titulo, String autor, int precio, String facultad) {
        super(titulo, autor, precio);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    void informacion() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Facultad: " + facultad);
    }
}
