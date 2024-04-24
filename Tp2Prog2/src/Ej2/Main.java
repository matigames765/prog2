package Ej2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Novela novela = new Novela(1967, "Gabriel Garcia Marquez", false, "Cien años de soledad",464);
        Universitario libroUniversitario = new Universitario(1997,"N.Gregory Mankiw", false, "Introduccion a la economia","Economia");
        Infantil libroInfantil = new Infantil(1997,"J.k.Rowling",false,"Harry Potter y la piedra filosofal","importancia del valor, la amistad y la perseverancia frente a la adversidad.");

        biblioteca.addLibro(novela);
        biblioteca.addLibro(libroUniversitario);
        biblioteca.addLibro(libroInfantil);

        System.out.println("Prestando el libro de harry potter");

        biblioteca.prestarLibro("Harry Potter y la piedra filosofal");

        System.out.print("Estado de prestado del libro: ");
        System.out.println(libroInfantil.isPrestado());

        System.out.println();

        System.out.println("Lista de libros en la biblioteca:");

        biblioteca.listarLibros();

        System.out.println("Se devuelve el libro");

        biblioteca.devolverLibro(libroInfantil);

        System.out.print("Estado de prestado del libro: ");
        System.out.println(libroInfantil.isPrestado());

        System.out.println();

        System.out.println("Lista de libros en la biblioteca:");

        biblioteca.listarLibros();
    }
}
