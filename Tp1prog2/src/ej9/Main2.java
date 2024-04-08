package ej9;


public class Main2 {

    public static void main(String[] args) {
        Circulo c = new Circulo(3.4);
        Rectangulo r = new Rectangulo(7.5,4.7);

        System.out.println("El area del circulo es " + c.calcularArea() + " cm2 y su perimetro es de " + c.calcularPerimetro() + " cm");
        System.out.println("El area del rectangulo es " + r.calcularArea() + " cm2 y su perimetro es de " + r.calcularPerimetro() + " cm");

    }



}
