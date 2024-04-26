import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Supermarket supermarket = new Supermarket();






        supermarket.addProduct(new Products("Leche", 2.5, 50));
        supermarket.addProduct(new Products("Pan", 1.0, 100));
        supermarket.addProduct(new Products("Manzanas", 0.5, 200));

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String lastName = scanner.nextLine();
        Clients client = new Clients(name,lastName);
        int choice;
        System.out.println("Buenas dias estimando cliente " + client.getName() + " " + client.getLastName());
        do {

            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Buscar un producto");
            System.out.println("3. Realizar una compra");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    supermarket.showInventory();
                    break;
                case 2:

                    System.out.print("Ingrese el nombre del producto: ");
                    String productName = scanner.nextLine();
                    System.out.println(supermarket.searchProduct(productName));
                    break;
                case 3:

                    System.out.print("Ingrese el nombre del producto a comprar: ");
                    String productToPurchase = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a comprar: ");
                    int quantityToPurchase = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double prize = scanner.nextDouble();
                    supermarket.makePurchase(productToPurchase,prize,quantityToPurchase);
                    break;
                case 4:

                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (choice != 4);

        System.out.println("El valor total de la compra es: " + Clients.totalPurchase());


        scanner.close();
    }
}