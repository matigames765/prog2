/*
5.	Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas veces
está repetido el mayor.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ej5 {
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


        for (int j = 0; j < 10; j++){
            if (numbers.get(j) > greater_number){
                greater_number = numbers.get(j);
            }
        }

        int greater_counter = 0;

        for (Integer num : numbers){
            if (num == greater_number){
                greater_counter++;
            }
        }

        System.out.println("El mayor numero en el arreglo se repite " + greater_counter + " vez/veces");

    }
}
