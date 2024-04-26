package ej1;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno alumno = new Alumno(45678890,"Julian",4567);
        Asignatura asignatura1 = new Asignatura(4,"8:00","Matematica");
        Asignatura asignatura2 = new Asignatura(6,"9:00","Lengua");
        Asignatura asignatura3 = new Asignatura(2,"10:00","Fisica");
        Asignatura asignatura4 = new Asignatura(9,"11:00","Psicologia");
        Grupo grupo1 = new Grupo("Primer año",'D');
        Profesor profesor1 = new Profesor(23456734,"Horacio","Ciencia Basicas");
        Profesor profesor2 = new Profesor(23456784,"Liliana","Humanidades");
        Profesor profesor3 = new Profesor(25678342,"Juliana","Ciencias Basicas");

        asignatura1.setProfesor(profesor1);
        asignatura2.setProfesor(profesor2);
        asignatura3.setProfesor(profesor3);
        asignatura4.setProfesor(profesor2);

        LinkedHashSet<Asignatura> asignaturas_ = new LinkedHashSet<>();

        asignaturas_.add(asignatura1);
        asignaturas_.add(asignatura2);
        asignaturas_.add(asignatura3);
        asignaturas_.add(asignatura4);

        /*a. Teniendo un objeto de Profesor, muestre el aula de la 3ra. asignatura.*/

        for (Asignatura asignatura : asignaturas_){
            if (profesor3 == asignatura.getProfesor()){
                System.out.println("Aula: " + asignatura.getAula());
            }
        }

        /*b. Teniendo un profesor, muestre todos los nombres de las asignaturas que imparte*/

        System.out.println("Asignaturas que imparte la profesora " + profesor2.getNombre() + ": ");

        for (Asignatura asignatura : asignaturas_){
            if (profesor2 == asignatura.getProfesor()){
                System.out.println(asignatura.getNombre());
            }
        }

        /* c. Teniendo una asignatura, muestre nombre y dni de los alumnos del grupo que recibe.*/

        HashSet<Alumno> alumnos = new HashSet<>();

        Alumno alumno1 = new Alumno(12345678, "Juan Pérez", 1001);
        Alumno alumno2 = new Alumno(23456789, "María Rodríguez", 1002);
        Alumno alumno3 = new Alumno(34567890, "Luis González", 1003);
        Alumno alumno4 = new Alumno(45678901, "Ana Martínez", 1004);
        Alumno alumno5 = new Alumno(56789012, "Carlos Sánchez", 1005);
        Alumno alumno6 = new Alumno(67890123, "Sofía López", 1006);
        Alumno alumno7 = new Alumno(78901234, "Diego Gómez", 1007);
        Alumno alumno8 = new Alumno(89012345, "Laura Díaz", 1008);
        Alumno alumno9 = new Alumno(90123456, "Pedro Ruiz", 1009);
        Alumno alumno10 = new Alumno(11223344, "Carolina Torres", 1010);

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        alumnos.add(alumno7);
        alumnos.add(alumno8);
        alumnos.add(alumno9);
        alumnos.add(alumno10);

        alumno1.addGrupo(grupo1);
        alumno2.addGrupo(grupo1);
        alumno3.addGrupo(grupo1);
        alumno4.addGrupo(grupo1);
        alumno5.addGrupo(grupo1);

        grupo1.addAsignatura(asignatura1);
        grupo1.addAsignatura(asignatura3);

        System.out.println("El nombre y dni de los alumnos de la asignatura " + asignatura1.getNombre() + " son: ");
        for (Asignatura asignatura : grupo1.getAsignaturas()){
            if (asignatura1 == asignatura){
                for (Alumno alumno_ : alumnos){
                    for (Grupo grupo_ : alumno_.getGrupos()){
                        if (grupo_ == grupo1){
                            System.out.println("Nombre: " + alumno_.getNombre());
                            System.out.println("Dni: " + alumno_.getDni());
                        }
                    }
                }

            }
        }

        /* e. Teniendo un alumno, muestre todas las asignaturas recibidas por el 1er. grupo al que
        pertenece.*/

        Grupo grupo2 = new Grupo("Primer año",'B');

        alumno1.addGrupo(grupo2);
        alumno3.addGrupo(grupo2);

        grupo2.addAsignatura(asignatura4);

        System.out.println("El alumno de nombre " + alumno1.getNombre() + " tiene las siguientes asignaturas en su primer grupo: ");

        for (Asignatura asignatura : alumno1.getGrupos().get(0).getAsignaturas()){
            System.out.println(asignatura.getNombre());
        }

        /* f. Teniendo un objeto de Alumno y, pidiendo por pantalla, una asignatura existente, muestre
        desde él, el profesor que la imparte */

        System.out.print("Ingrese una asignatura para ver con que profesor la toma el alumno " + alumno1.getNombre() + ": ");
        String asignaturaa = sc.nextLine();

        for (Grupo grupo : alumno1.getGrupos()){
            for (Asignatura asignatura : grupo.getAsignaturas()){
                if (asignatura.getNombre().toLowerCase().equals(asignaturaa.toLowerCase())){
                    System.out.println("El Profesor que imparte la materia " + asignaturaa + " es el profesor " + asignatura.getProfesor().getNombre());
                }
            }
        }

        /* g. Teniendo un objeto de Profesor, muestre los nombres de todos los alumnos inscriptos en el
        Grupo de la 2da. Asignatura.*/

        grupo1.addAsignatura(asignatura2);

        for (Asignatura asignatura : grupo1.getAsignaturas()){
            if (asignatura.getProfesor().getNombre().toLowerCase().equals(profesor2.getNombre().toLowerCase()) && asignatura.getNombre().equals("Lengua")){
                for (Alumno alumnoo : alumnos){
                    for (Grupo grupo : alumnoo.getGrupos()){
                        if (grupo.getLetra() == grupo1.getLetra()){
                            System.out.println("Nombre: " + alumnoo.getNombre() + ", Dni: " + alumnoo.getDni() + ", Legajo: " + alumnoo.getNroLegajo());
                    }
                }
            }

        }






















    }
}}