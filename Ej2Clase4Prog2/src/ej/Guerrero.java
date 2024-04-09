package ej;

public class Guerrero extends PersonajeBase {

    public Guerrero() {
    }

    public Guerrero(String nombre, int nivel, int puntosDeVida, int defensaFisica, int danioInfligido) {
        super(nombre, nivel, puntosDeVida, defensaFisica, danioInfligido);
    }

    @Override
    public int atacar() {
        return this.getDanioInfligido();
    }

    @Override
    public int defender(int danio) {
        return this.getDefensaFisica() - danio;
    }
}
