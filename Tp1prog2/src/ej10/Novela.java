package ej10;

public class Novela extends Libro{

    private String tipo;

    public Novela() {
    }

    public Novela(String titulo, String autor, int precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    void informacion(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Tipo de novela: " + tipo);
    }
}
