package ejComposicion;
import java.util.ArrayList;

public class Casa {

    private ArrayList<Puerta> puertas;

    private int numPuertas = 0;

    public Casa() {
    }

    public Casa(ArrayList<Puerta> puertas) {
        this.puertas = new ArrayList<>();
    }

    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }

    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void agregarPuertas(Puerta puerta){
        puertas.add(puerta);
        numPuertas++;
    }
}
