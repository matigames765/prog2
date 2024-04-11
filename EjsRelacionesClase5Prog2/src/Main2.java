import ejAsociacionBidireccional.Libro;
import ejAsociacionBidireccional.Persona;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("María");


        Libro libro1 = new Libro( "El señor de los anillos");
        Libro libro2 = new Libro( "Harry potter");


        persona1.agregarLibros(libro1);
        persona1.agregarLibros(libro2);
        persona2.agregarLibros(libro2);


        System.out.println("Libros de " + persona1.getNombre() + ":");
        for (Libro libro : persona1.getLibros()) {
            System.out.println("- " + libro.getTitulo());
        }

        System.out.println("Libros de " + persona2.getNombre() + ":");
        for (Libro libro : persona2.getLibros()) {
            System.out.println("- " + libro.getTitulo());
        }


        System.out.println("Personas que poseen el libro 'Harry Potter':");
        for (Persona persona : libro2.getPropietarios()) {
            System.out.println("- " + persona.getNombre());
        }


    }
}
