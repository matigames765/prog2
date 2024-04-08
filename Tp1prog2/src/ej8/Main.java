package ej8;



public class Main {
    public static void main(String[] args) {
        Gerente e = new Gerente("Matias",47,70000.0,"Informatica");
        Trabajador t = new Trabajador("Juan",32,40000.0,"Electronica");

        System.out.println("Informacion gerente:" );
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Salario: " + e.getSalario());
        System.out.println("Departamento: " + e.getDepartamento());
        System.out.println("Y sus metodos en funcion nos dan...");
        e.organizarActividades();
        e.trabajar();


        System.out.println("------------------------------------");
        System.out.println("Informacion trabajador: ");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Edad: " + t.getEdad());
        System.out.println("Salario: " + t.getSalario());
        System.out.println("Area: " + t.getArea());
        System.out.println("Y sus metodos en funcion nos dan...");
        t.producir();
        t.trabajar();





    }
}