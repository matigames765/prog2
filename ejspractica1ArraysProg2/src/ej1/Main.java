package ej1;
import java.util.Scanner;
import java.util.ArrayList;

/*
1.	Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo
está el mayor número leído.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        Integer number = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Ingresa el numero " + (i + 1) + " a la lista: ");
            number = sc.nextInt();
            numbers.add(number);
        }

        Integer greater_number = 0;
        int greater_number_position = 0;

        for (int j = 0; j < 10; j++){
            if (numbers.get(j) > greater_number){
                greater_number = numbers.get(j);
                greater_number_position = j;
            }
        }

        System.out.println("La posicion del arrreglo del mayor numero es " + greater_number_position);





    }
}