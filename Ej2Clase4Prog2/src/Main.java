import ej.Guerrero;
import ej.Mago;
import ej.Picaro;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Spartacus",40,120,10,8);
        Mago mago = new Mago("Merlin",42,117,13,5,2);
        Picaro picaro = new Picaro("Sombra",37,119,11,7);

        System.out.println("Un guerrero estaba caminando tranquilamente...");
        System.out.println("Su nombre era " + guerrero.getNombre());
        System.out.println("Pero de la nada aparecio un mago llamado "  + mago.getNombre() +  " y lo ataco lanzandole un hechizo");
        guerrero.setPuntosDeVida(guerrero.getPuntosDeVida() - guerrero.defender(mago.getDanioInfligido()));
        System.out.println("daño hecho por mago: " + guerrero.defender(mago.getDanioInfligido()));
        System.out.println("Puntos de vida restantes: " + guerrero.getPuntosDeVida());
        System.out.println("-----------------------------------------------");
        System.out.println("Luego de este ataque el guerrero ataco al mago con su espada...");
        mago.setPuntosDeVida(mago.getPuntosDeVida() - mago.defender(guerrero.getDanioInfligido()));
        System.out.println("Daño hecho por guerrero: " + mago.defender(guerrero.getDanioInfligido()));
        System.out.println("Puntos de vida restantes: " + guerrero.getPuntosDeVida());
        System.out.println("-----------------------------------------------");
        System.out.println("Luego aparecio un picaro y ataco al guerrero y al mago...");
        System.out.println("Se llamaba " + picaro.getNombre());

        guerrero.setPuntosDeVida(guerrero.getPuntosDeVida() - guerrero.defender(picaro.getDanioInfligido()));
        mago.setPuntosDeVida(mago.getPuntosDeVida() - mago.defender(picaro.getDanioInfligido()));

        System.out.println("Puntos de vida guerrero: " + guerrero.getPuntosDeVida());
        System.out.println("Puntos de vida mago: " + mago.getPuntosDeVida());
        System.out.println("-----------------------------------------------");
        System.out.println("Esta batalla continuara....");
    }
}