/*
2.	Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo está
el mayor número primo leído
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        Integer number = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Ingresa el numero " + (i + 1) + " a la lista: ");
            number = sc.nextInt();
            numbers.add(number);
        }

        Integer greater_number_prime = 0;
        int greater_number_position = 0;
        int divisors = 0;

        for (int j = 0; j < 10; j++){
            if (numbers.get(j) > greater_number_prime){
                for (int h = 1; h < numbers.get(j); h++){
                    if (numbers.get(j) % h == 0){
                        divisors++;
                    }
                }
                if (divisors == 2){
                    greater_number_prime = numbers.get(j);
                    greater_number_position = j;
                }
            }
        }

        System.out.println("La posicion del arrreglo del mayor numero primo es " + greater_number_position);
    }



}
