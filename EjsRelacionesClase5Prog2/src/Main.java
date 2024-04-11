import ejAsociacionUnidireccional.Estudiante;
import ejAsociacionUnidireccional.Universidad;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estudiante;
        String uni;
        int cambio;
        int fuera;
        Universidad universidad = new Universidad();
        Estudiante estudiante_ = new Estudiante();

        while (true){
            System.out.print("Ingresa el nombre del estudiante: ");
            estudiante = sc.nextLine();
            System.out.print("Ingresa a la universidad que va el estudiante: ");
            uni = sc.nextLine();

            universidad.setNombre(uni);
            estudiante_.setNombre(estudiante);
            estudiante_.setUniversidad(universidad);





            System.out.println("Estudiante: ");
            System.out.println("Nombre: " + estudiante_.getNombre());
            System.out.println("Universidad: " + universidad.getNombre());

            System.out.print("Ingresa 1 si quieres cambiar la universidad del estudiante o 0 si no: ");
            cambio = sc.nextInt();
            sc.nextLine();

            if (cambio == 1){
                System.out.print("Ingresa el nombre de la universidad: ");
                uni = sc.nextLine();
                universidad.setNombre(uni);
                System.out.println("Estudiante: ");
                System.out.println("Nombre: " + estudiante_.getNombre());
                System.out.println("Universidad: " + universidad.getNombre());
            }

            System.out.print("Ingresa 1 para salir o 0 para seguir agregando estudiantes: ");
            fuera = sc.nextInt();
            sc.nextLine();

            if (fuera == 1){
                break;
            }

        }
    }
}