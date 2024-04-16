import java.util.Iterator;
import java.util.ArrayList;

public class Equipo implements Iterable<Jugador>{

    private ArrayList<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    @Override
    public Iterator<Jugador> iterator() {
        return new MiIterador();
    }


    private class MiIterador implements Iterator<Jugador>{
        private int indice = 0;

        @Override
        public boolean hasNext() {
            return indice < jugadores.size();
        }

        @Override
        public Jugador next() {
            return jugadores.get(indice++);
        }
    }
}
