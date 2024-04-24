package Ej1;
import java.util.ArrayList;

public class TiendaMascotas {
    private ArrayList<Animal> tienda;

    public TiendaMascotas() {
        this.tienda = new ArrayList<>();
    }

    public ArrayList<Animal> getTienda() {
        return tienda;
    }

    public void setTienda(ArrayList<Animal> tienda) {
        this.tienda = tienda;
    }

    public void addAnimal(Animal animal){
        tienda.add(animal);
    }

    public void venderAnimal(String nombre){
        Animal animalVender = null;
        for (Animal animal : tienda){
            if (animal.getNombre().equals(nombre)){
                animalVender = animal;
                break;
            }
        }
        tienda.remove(animalVender);
    }

    public void alimentarAnimal(String nombre){
        for (Animal animal : tienda){
            if (animal.getNombre().equals(nombre)){
                animal.Alimentar(nombre);
                System.out.println("Se alimento al animal");
            }
        }

    }

    public void listarAnimales(){
        System.out.println("Listado de animales:");
        for (Animal animal : tienda){
            System.out.println(animal.toString());
        }
    }
}
