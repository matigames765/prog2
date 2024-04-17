/*
4.	Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posiciones se
encuentran los números terminados en 4.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int number = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            number = sc.nextInt();
            numbers.add(number);
        }

        for (int j = 0; j < 10; j++){
            if (numbers.get(j) % 10 == 4){
                System.out.println("Un numero terminado en 4 esta en la posicion " + (j + 1));
            }
        }



    }
}
