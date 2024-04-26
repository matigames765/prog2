package ej4;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int counterStudents = 0;
        String name;
        int age;
        double note;
        int out;
        StudentsList studentsList = new StudentsList();
        while (true){
            try {
                System.out.print("Ingrese el nombre del alumno " + (counterStudents + 1) + ": ");
                name = sc.nextLine();
                System.out.print("Ingrese la edad del alumno " + (counterStudents + 1) + ": ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese la nota del alumno " + (counterStudents + 1) + ": ");
                note = sc.nextDouble();
                sc.nextLine();
                Student student = new Student(name,age,note);
                counterStudents++;
                studentsList.addStudent(student);
                System.out.print("Ingrese 0 para salir o cualquier otro numero para seguir ingresando alumnos: ");
                out = sc.nextInt();
                if (out == 0){
                    break;
                }
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Ingrese bien los datos, vuelvalos a ingresar");
                sc.nextLine();
            }

        }

        System.out.println("La lista de alumnos es la siguiente: ");
        studentsList.showList();

        studentsList.calculateTheHalf();

        studentsList.greaterNoteStudent();

        sc.nextLine();

        String studentName;
        while (true){
            System.out.print("Ingrese el nombre del alumno que desea conocer su informacion: ");
            studentName = sc.nextLine();



            studentsList.searchStudent(studentName);

            System.out.print("Ingrese 0 para salir o cualquier otro numero para seguir mostrando alumnos: ");
            out = sc.nextInt();
            if (out == 0){
                break;
            }
            sc.nextLine();
        }

    }
}
