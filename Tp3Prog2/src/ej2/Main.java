package ej2;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Martin");
        Empleado supervisor1 = new Empleado("Julian");
        Empleado empleado2 = new Empleado("Facundo");
        Empleado supervisor2 = new Empleado("Horacio");

        empleado1.asignarSupervisor(supervisor1);

        System.out.println("Supervisor del primer empleado: " + empleado1.obtenerNombreSupervisor());
    }
}
