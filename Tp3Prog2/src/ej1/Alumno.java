package ej1;
import java.util.ArrayList;
public class Alumno extends Persona{

    private int nroLegajo;

    private ArrayList<Grupo> grupos;

    public Alumno(int dni, String nombre, int nroLegajo) {
        super(dni, nombre);
        this.nroLegajo = nroLegajo;
        this.grupos = new ArrayList<>();
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void addGrupo(Grupo grupo){
        grupos.add(grupo);
    }
}
