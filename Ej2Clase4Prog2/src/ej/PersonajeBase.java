package ej;

public abstract class PersonajeBase implements Personaje{

    private String nombre;

    private int nivel;

    private int puntosDeVida;

    private int defensaFisica;

    private int danioInfligido;

    public PersonajeBase() {
    }

    public PersonajeBase(String nombre, int nivel, int puntosDeVida, int defensaFisica, int danioInfligido) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.defensaFisica = defensaFisica;
        this.danioInfligido = danioInfligido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getDefensaFisica() {
        return defensaFisica;
    }

    public void setDefensaFisica(int defensaFisica) {
        this.defensaFisica = defensaFisica;
    }

    public int getDanioInfligido() {
        return danioInfligido;
    }

    public void setDanioInfligido(int danioInfligido) {
        this.danioInfligido = danioInfligido;
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public int defender(int danio) {
        return 0;
    }
}
