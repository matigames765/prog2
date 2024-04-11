import ejAgregacion.Departamento;
import ejAgregacion.Empleado;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Gerente","Matias");
        Empleado empleado2 = new Empleado("Desarrollador Backend", "Jorge");
        Empleado empleado3 = new Empleado("Desarrollador Frontend","Juan");
        Empleado empleado4 = new Empleado("Contador","Julian");

        Departamento departamento1 = new Departamento(new ArrayList<Empleado>(),"Informatica");
        Departamento departamento2 = new Departamento(new ArrayList<>(),"Contabilidad");


        departamento2.agregarEmpleados(empleado1);
        departamento2.agregarEmpleados(empleado4);

        departamento1.agregarEmpleados(empleado2);
        departamento1.agregarEmpleados(empleado3);

        System.out.println("Los empleados del departamento de " + departamento1.getNombre() + " son:");
        for (Empleado empleado : departamento1.getEmpleados()){
            System.out.println(empleado.getNombre());
        }

        System.out.println("Los empleados del departamento de " + departamento2.getNombre() + " son:");
        for (Empleado empleado : departamento2.getEmpleados()){
            System.out.println(empleado.getNombre());
        }


    }
}
