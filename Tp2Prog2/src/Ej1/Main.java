package Ej1;


public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();

        Gato gato = new Gato("Pepa",3,"gato",45.6,true,"gato europeo");
        Perro perro = new Perro("Firulais",7,"perro",34.5,"Golden",true);
        Ave ave = new Ave("Chigueño",2,"ave",56.6,"tucan",false);
        Pez pez = new Pez("Nemo",5,"pez",100.3,"Regiones calidas de oceano pacifico y indico",true);

        tiendaMascotas.addAnimal(gato);
        tiendaMascotas.addAnimal(perro);
        tiendaMascotas.addAnimal(ave);
        tiendaMascotas.addAnimal(pez);

        tiendaMascotas.venderAnimal(perro.getNombre());

        tiendaMascotas.listarAnimales();

        tiendaMascotas.alimentarAnimal(gato.getNombre());

    }
}