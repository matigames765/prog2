package Ej2;

public class Infantil extends Libro{

    private String moraleja;

    public Infantil(int aniodePublicacion, String autor, boolean prestado, String titulo, String moraleja) {
        super(aniodePublicacion, autor, prestado, titulo);
        this.moraleja = moraleja;
    }

    public String getMoraleja() {
        return moraleja;
    }

    public void setMoraleja(String moraleja) {
        this.moraleja = moraleja;
    }

    @Override
    public void devolver() {
        this.setPrestado(false); /* Ver si esto esta bien o no */
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
        return "Año de publicacion: " + this.getAniodePublicacion() + ", Autor: " + this.getAutor() + ", Prestado?: " + prestacion + ", Titulo: " + this.getTitulo() + ", Moraleja: " + moraleja;
    }
}
