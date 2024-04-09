package ej;

public class Picaro extends PersonajeBase{

    public Picaro() {
    }

    public Picaro(String nombre, int nivel, int puntosDeVida, int defensaFisica, int danioInfligido) {
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
