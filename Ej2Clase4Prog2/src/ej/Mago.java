package ej;

public class Mago extends PersonajeBase{

    private int defensaMagica;

    public Mago() {
    }

    public Mago(String nombre, int nivel, int puntosDeVida, int defensaFisica, int danioInfligido, int defensaMagica) {
        super(nombre, nivel, puntosDeVida, defensaFisica, danioInfligido);
        this.defensaMagica = defensaMagica;
    }

    public int getDefensaMagica() {
        return defensaMagica;
    }

    public void setDefensaMagica(int defensaMagica) {
        this.defensaMagica = defensaMagica;
    }

    @Override
    public int atacar() {
        return this.getDanioInfligido();
    }

    @Override
    public int defender(int danio) {
        return (this.getDefensaFisica() + defensaMagica) - danio;
    }
}
