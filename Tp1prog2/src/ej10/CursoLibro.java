package ej10;

public class CursoLibro extends Libro{

    private String curso;

    public CursoLibro(){}

    public CursoLibro(String titulo, String autor, int precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    void informacion() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Curso: " + curso);

    }
}
