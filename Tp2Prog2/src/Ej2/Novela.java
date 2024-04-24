package Ej2;

public class Novela extends Libro{

    private int cantidadPaginas;

    public Novela(int aniodePublicacion, String autor, boolean prestado, String titulo, int cantidadPaginas) {
        super(aniodePublicacion, autor, prestado, titulo);
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
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
        return "Año de publicacion: " + this.getAniodePublicacion() + ", Autor: " + this.getAutor() + ", Prestado?: " + prestacion + ", Titulo: " + this.getTitulo() + ", Cantidad de paginas: " + cantidadPaginas;
    }
}
