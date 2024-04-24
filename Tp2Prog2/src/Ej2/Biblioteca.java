package Ej2;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public void listarLibros(){
        for (Libro libro : libros){
            System.out.println(libro.toString());
        }
    }

    public void prestarLibro(String titulo){
        Libro libroprestar = null;
        for (Libro libro : libros){
            if (titulo.equals(libro.getTitulo())){
                libroprestar = libro;
                libroprestar.prestar();
                break;
            }
        }
        libros.remove(libroprestar);
    }

    public void devolverLibro(Libro libro){
        libro.devolver();
        libros.add(libro);
    }

}