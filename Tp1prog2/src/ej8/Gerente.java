package ej8;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente() {
    }

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }



    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void organizarActividades(){
        System.out.println("Organizando actividades...");

    }

    @Override
    void trabajar() {
        System.out.println("Trabajando...");
    }
}
