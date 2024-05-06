package ej2;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
/*
2. Teniendo el siguiente codigo en Java capture y maneje todas las excepciones que puedan
producirse
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n;
        int posicion;
        String cadena ;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contenido del array antes de modificar:");
        try{
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
        }catch (IndexOutOfBoundsException iobe){
            System.out.println("Se esta tratando de acceder a un indice fuera de rango, cuidado...");
        }

        while (true) {
            try {
                System.out.print("\n\nIntroduce la posición del array a modificar: ");
                cadena = sc.nextLine();
                posicion = Integer.parseInt(cadena);
                if (posicion < 0 || posicion > 8) {
                    throw new IllegalArgumentException("Debes ingresar una posicion entre 0 y 9, vuelva a ingresar...");
                }
                break;
            }catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        while (true){
            try{
                System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
                n = sc.nextDouble();
                valores[posicion] = n;
                break;
            }catch (InputMismatchException ime){
                System.out.println("No estas introduciendo un double, vuelva a ingresar...");
                sc.nextLine();
            }
        }

        System.out.println("\nPosición a modificar " + posicion);
        System.out.println("Nuevo valor: " + n);
        System.out.println("Contenido del array modificado:");

        try{
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
        }catch (IndexOutOfBoundsException iobe){
            System.out.println("Se esta tratando de acceder a un indice fuera de rango, cuidado...");
        }



    }
}
