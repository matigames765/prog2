package ej1;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
/*
1. Escribe un programa que juegue con el usuario a adivinar un número. El ordenador debe
generar un
número entre 1 y 100, y el usuario tiene que intentar adivinarlo. Para ello, cada vez
que el usuario
introduce un valor, el ordenador debe decirle al usuario si el número que tiene que
adivinar es mayor o
menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo
e imprimir en
pantalla el número de veces que el usuario ha intentado adivinar el número. Si el
usuario introduce algo
que no es un número, debe indicarlo en pantalla, y contarlo como un intento.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int tries = 0;
        int randomNumber = randomNumber = random.nextInt(100 - 1 + 1) + 1;;
        int userNumber;

        while (true){

            try{
                System.out.print("Introduzca un numero entre 1 y 100 para ver si adivina: ");
                userNumber = sc.nextInt();
                tries++;
                if (userNumber > randomNumber){
                    System.out.println("El numero que debe adivinar es menor que el introducido");
                }else if (userNumber < randomNumber) {
                    System.out.println("El numero que debe adivinar es mayor que el introducido");
                }else{
                    System.out.println("Muy bien ha adivinado el numero!");
                    break;
                }
            }catch (InputMismatchException ime){
                System.out.println("No ha introducido un numero, por favor vuelva a introducir");
                tries++;
                sc.nextLine();
            }

        }
        System.out.println("El numero de veces que intestaste adivinar el numero fue " + tries);
    }
}