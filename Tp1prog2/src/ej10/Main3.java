package ej10;

public class Main3 {
    public static void main(String[] args) {
        CursoLibro cl = new CursoLibro("El señor de los anillos","J.R.R.Tolkien",400,"Lengua");
        LibroUniv lu = new LibroUniv("Calculo 1","James Stewart",500,"Ingenieria");
        Novela n = new Novela("Cien años de soledad","Gabriel Garcia Marquez",700,"realismo magico");

        System.out.println("Informacion de los tres libros: ");
        cl.informacion();
        System.out.println("--------------------------------");
        lu.informacion();
        System.out.println("--------------------------------");
        n.informacion();
    }
}
