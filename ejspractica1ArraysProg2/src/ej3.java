/*
3.	Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos entre
100 y 300. Luego mostrarlos en pantalla.
 */

import java.util.ArrayList;
public class ej3 {
    public static void main(String[] args) {


        ArrayList<Integer> prime_numbers = new ArrayList<>();

        int divisors = 0;

        for (int i = 100; i < 301; i++){
            for (int j = 1; j < i + 1; j++){
                if (i % j == 0){
                    divisors++;
                }
            }
            if (divisors == 2){
                prime_numbers.add(i);
            }
            divisors = 0;
            if (prime_numbers.size() == 10){
                break;
            }
        }

        System.out.println("Los 10 primeros numeros primos comprendidos entre 100 y 300 son: ");
        for (Integer prime_number : prime_numbers){
            System.out.println(prime_number);
        }

    }
}
