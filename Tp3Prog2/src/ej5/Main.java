package ej5;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TasksList tasksList = new TasksList();
        String description;
        int priority;
        int out = 0;
        while (true){
            try {
                System.out.print("Ingresa la descripcion de la tarea: ");
                description = sc.nextLine();


                System.out.print("Ingresa el nivel de prioridad de la tarea del 1 al 10: ");
                priority = sc.nextInt();

                Task task = new Task(description, priority);

                tasksList.addTasks(task);

                System.out.print("Si quieres salir aprieta 0 o si quieres seguir ingresando tareas aprieta cualquier otro numero: ");
                out = sc.nextInt();

                if (out == 0) {
                    break;
                }
                sc.nextLine();

            }catch (InputMismatchException e){
                System.out.println("Ingresa bien los datos por favor vuelva a ingresar.");
                sc.nextLine();
            }
        }

        tasksList.orderList();

        System.out.println("Las tareas de la lista en orden descendente: ");
        tasksList.showList();

        sc.nextLine();

        System.out.print("Ingresa una descripcion para eliminar una tarea: ");
        String removeDescription = sc.nextLine();

        tasksList.removeByDescription(removeDescription);

        System.out.println("Comprobacion de tarea eliminada: ");
        System.out.println("Lista de tareas ");
        tasksList.showList();

        System.out.println("Saliendo del programa...");


    }
}
