package Ej2;

public abstract class Libro implements Prestable{

    private int aniodePublicacion;

    private String autor;

    private boolean prestado;

    private String titulo;

    public Libro(int aniodePublicacion, String autor, boolean prestado, String titulo) {
        this.aniodePublicacion = aniodePublicacion;
        this.autor = autor;
        this.prestado = prestado;
        this.titulo = titulo;
    }

    public int getAniodePublicacion() {
        return aniodePublicacion;
    }

    public void setAniodePublicacion(int aniodePublicacion) {
        this.aniodePublicacion = aniodePublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void devolver() {

    }

    @Override
    public void prestar() {

    }
}


