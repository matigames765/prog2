package ejAsociacionBidireccional;
import java.util.ArrayList;

public class Libro {

    private ArrayList<Persona> propietarios;

    private String titulo;



    public Libro( String titulo) {
        this.titulo = titulo;
        this.propietarios = new ArrayList<>();

    }

    public ArrayList<Persona> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<Persona> propietarios) {
        this.propietarios = propietarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void agregarPersonas(Persona persona){
        propietarios.add(persona);
    }
}
