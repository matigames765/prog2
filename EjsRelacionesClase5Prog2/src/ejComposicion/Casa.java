package ejComposicion;
import java.util.ArrayList;

public class Casa {

    private ArrayList<Puerta> puertas;

    private int numPuertas = 0;



    public Casa() {
        this.puertas = new ArrayList<>();
        this.agregarPuertas("MDF");
        this.agregarPuertas("Aglomerado");
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

    public void agregarPuertas(String material){
        Puerta puerta = new Puerta(material);
        puertas.add(puerta);
        numPuertas++;
    }
}
