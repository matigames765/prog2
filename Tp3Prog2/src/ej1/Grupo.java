package ej1;
import java.util.ArrayList;

public class Grupo {
    private String curso;

    private char letra;

    private ArrayList<Asignatura> asignaturas;

    public Grupo(String curso, char letra) {
        this.curso = curso;
        this.letra = letra;
        this.asignaturas = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void addAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }

    public void eliminarAsignatura(Asignatura asignatura){
        asignaturas.remove(asignatura);
    }
}
