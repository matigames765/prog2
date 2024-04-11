import ejComposicion.Casa;
import ejComposicion.Puerta;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        Puerta puerta1 = new Puerta("Madera");
        Puerta puerta2 = new Puerta("Metal");
        Puerta puerta3 = new Puerta("Composite");

        Casa casa = new Casa(new ArrayList<Puerta>());

        casa.agregarPuertas(puerta1);
        casa.agregarPuertas(puerta2);
        casa.agregarPuertas(puerta3);

        System.out.println("Los materiales de las tres puertas de la casa sonn: ");
        for (Puerta puerta : casa.getPuertas()){
            System.out.println(puerta.getMaterial());
        }
    }
}
