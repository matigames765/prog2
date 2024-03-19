package herencia1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coche nissanMarch = new Coche("gris",4,220.0,350);
        Bicicleta venzo = new Bicicleta("negra",2,"deportiva");
        Camioneta raptor = new Camioneta("azul",4,300,600,1200);
        Motocicleta honda = new Motocicleta("negra",2,"deportiva",250.0,150);

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(nissanMarch);
        listaVehiculos.add(venzo);
        listaVehiculos.add(raptor);
        listaVehiculos.add(honda);

        catalogar1(listaVehiculos);

        System.out.print("Ingresa un numero de ruedas para ver si coincide alguno de los vehiculos: ");
        int ruedas = sc.nextInt();

        catalogar2(ruedas, listaVehiculos);




    }
    public static void catalogar1(ArrayList<Vehiculo> listaVehiculos){
        for (Vehiculo vehiculo : listaVehiculos){
            System.out.println("Tipo de vehículo: " + vehiculo.getClass().getSimpleName());
            System.out.println("Atributos:");
            System.out.println(vehiculo);
            System.out.println();

        }
    }

    public static void catalogar2(int ruedas,ArrayList<Vehiculo> listaVehiculos){
        int contadorCoincidencias = 0;
        for (Vehiculo vehiculo : listaVehiculos){
            if (vehiculo.getRuedas() == ruedas){
                System.out.println(vehiculo.getClass().getSimpleName());
                contadorCoincidencias++;
            }
        }
        System.out.println("Se han encontrado " + contadorCoincidencias + " vehiculos con " + ruedas + " rueda/ruedas");
    }
}
