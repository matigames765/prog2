import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operator = 0;
        int number1 = 0;
        int number2 = 0;
        boolean validation = false;
        while (!validation){
            try{
                System.out.print("Ingrese el primer numero de la operacion: ");
                number1 = sc.nextInt();
                System.out.print("Ingrese el segundo numero de la operacion: ");
                number2 = sc.nextInt();
                System.out.print("Ingrese 1 para (+), 2 (-), 3 (x) y 4 (/): ");
                operator = sc.nextInt();
                if (operator >= 1 && operator <= 4){
                    /**/
                }else{
                    throw new IllegalArgumentException("El numero no esta entre 1 y 4, ingrese otra vez");
                }
                validation = true;
            }catch (InputMismatchException e){
                System.out.println("Error: Introduzca un valor numerico porfavor.");
                sc.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
        validation = false;
        switch (operator){
            case 1:
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
                break;
            case 4:
                while (!validation){
                    try{
                        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                        validation = true;
                    }catch (ArithmeticException e){
                        System.out.println("No se puede dividir por cero");
                        System.out.print("Ingrese nuevamente el divisor: ");
                        number2 = sc.nextInt();
                    }
                }
                break;
        }


    }
}