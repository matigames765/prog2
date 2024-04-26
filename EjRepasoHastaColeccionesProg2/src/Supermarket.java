import java.util.ArrayList;
public class Supermarket {

    private ArrayList<Products> inventory;

    public Supermarket() {
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Products> getInventory() {
        return inventory;
    }

    public void addProduct(Products product){
        inventory.add(product);
    }

    public String searchProduct(String name){
        for (Products product : inventory){
            if (product.getName().toLowerCase().equals(name.toLowerCase())){
                return "Precio: " + product.getPrize() + ", Stock: " + product.getStockQuantity();
            }
        }
        return "Producto no encontrado";
    }

    public void makePurchase(String name,double prize, int quantity){
        Products purchaseProduct = new Products(name,prize,quantity);
        int newStock;
        for (Products product : inventory){
            if (product.getName().toLowerCase().equals(name.toLowerCase())){
                if (product.getStockQuantity() < quantity){{
                    System.out.println("No se puede realizar la compra no hay esa cantidad de stock");
                }} else if (product.getStockQuantity() == quantity) {
                    name = product.getName();
                    inventory.remove(product);
                    Clients.addProductInShoppingCart(purchaseProduct);
                }else{
                    name = product.getName();
                    newStock = product.getStockQuantity() - quantity;
                    product.setStockQuantity(newStock);
                    Clients.addProductInShoppingCart(purchaseProduct);
                }
                {

                }
            }
        }
    }

    public void showInventory(){
        System.out.println("Lista de productos en el inventario:");
        for (Products product : inventory){
            System.out.println("Nombre: " + product.getName() + ", Precio: " + product.getPrize() + ", Stock: " + product.getStockQuantity());
        }
    }
}
