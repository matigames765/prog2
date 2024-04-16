
public class Main {
    public static void main(String[] args) {

        Jugador arquero = new Jugador("Casillas",1,1,1.80);
        Jugador defensa = new Jugador("Ramos",4,4,1.83);
        Jugador mediocampista = new Jugador("Busquets",5,5,1.87);
        Jugador delantero = new Jugador("Suarez",9,9,1.90);

        Equipo equipo = new Equipo();

        equipo.agregarJugador(arquero);
        equipo.agregarJugador(defensa);
        equipo.agregarJugador(mediocampista);
        equipo.agregarJugador(delantero);

        for (Jugador jugador : equipo){
            System.out.println(jugador.getNombre());
        }




    }
}
