package ej3;
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

/*
 Escribe un programa java que permita calcular el área de un triángulo, la lectura de base y
 altura será
por teclado, considere que el usuario podría ingresar de forma errada los datos como
letras, espacios en
blanco, simboles especiales.
 */

/* Preguntar por espacios en blanco */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double base;
        double height;
        while (true){
            try{
                System.out.print("Ingrese la medida de la base del triangulo: ");
                base = sc.nextDouble();
                System.out.println("Ingrese la medida de la altura del triangulo: ");
                height = sc.nextDouble();
                System.out.println("El area del triangulo es de " + ((base * height) / 2));
                break;
            }catch (InputMismatchException eme){
                System.out.println("No ha introducido un numero, vuelva a ingresar los datos;");
                sc.nextLine();
            }
        }

    }
}
