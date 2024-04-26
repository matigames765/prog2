package ej3;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();

        System.out.println("Creo la lista con los dias de la semana");

        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miercoles");
        weekDays.add("Jueves");
        weekDays.add("Viernes");
        weekDays.add("Sabado");
        weekDays.add("Domingo");

        System.out.println("Ingreso Juernes en la posicion 4");

        weekDays.add(4,"Juernes");

        System.out.println("Muestro por pantalla los elementos en la posicion 3 y 4 respectivamente");

        System.out.println("Elemento de la posicion 3: " + weekDays.get(3));
        System.out.println("Elemento de la posicion 4: " + weekDays.get(4));

        System.out.println("Muestro el primer y ultimo elemento de la lista");

        System.out.println("Primer elemento de la lista: " + weekDays.get(0));
        System.out.println("Ultimo elemento de la lista: " + weekDays.get(6));

        System.out.println("Elimino el elemento Juernes de la lista");

        weekDays.remove("Juernes");

        System.out.println("Compruebo que haya sido eliminado mostrando por pantalla la lista");

        System.out.println(weekDays);

        System.out.println("Creo un iterador para listar los elementos de la lista");

        for (String day : weekDays){
            System.out.println(day);
        }

        System.out.println("Verifico si se encuentra o no el elemento Lunes en la lista");

        if (weekDays.contains("Lunes")){
            System.out.println("El elemento lunes se encuentra en la lista");
        }else{
            System.out.println("El elemento lunes no se encuentra en la lista");
        }

        System.out.println("Veo si se encuentra o no el elemento Lunes sin importar mayusculas o minusculas");

        String monday = "Lunes";

        for (String day : weekDays){
            if (monday.toLowerCase().equals(day.toLowerCase())){
                System.out.println("El elemento Lunes se encuentra sin importar mayusculas o minusculas");
            }
        }

        System.out.println("Borro los elementos de la lista y lo compruebo");

        weekDays.clear();

        System.out.println(weekDays);


    }
}
