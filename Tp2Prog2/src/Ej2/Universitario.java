package Ej2;

public class Universitario extends Libro{

    private String campoEstudio;

    public Universitario(int aniodePublicacion, String autor, boolean prestado, String titulo, String campoEstudio) {
        super(aniodePublicacion, autor, prestado, titulo);
        this.campoEstudio = campoEstudio;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }

    @Override
    public void devolver() {
        this.setPrestado(false);
    }

    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    public String toString(){
        String prestacion = "";
        if (this.isPrestado() == true){
            prestacion = "si";
        }else{
            prestacion = "no";
        }
        return "Año de publicacion: " + this.getAniodePublicacion() + ", Autor: " + this.getAutor() + ", Prestado?: " + prestacion + ", Titulo: " + this.getTitulo() + ", Campo de estudio: " + campoEstudio;
    }
}
