package ej1;

public class Asignatura {

    private int aula;

    private String hora;

    private String nombre;

    private Profesor profesor;

    public Asignatura(int aula, String hora, String nombre) {
        this.aula = aula;
        this.hora = hora;
        this.nombre = nombre;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
