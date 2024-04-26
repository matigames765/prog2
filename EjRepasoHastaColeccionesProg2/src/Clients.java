import java.util.ArrayList;
public class Clients {

    private String name;

    private String lastName;

    private static ArrayList<Products> shoppingCart;

    public Clients(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.shoppingCart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public static void addProductInShoppingCart(Products product){
        shoppingCart.add(product);
    }

    public static double totalPurchase(){
        double total = 0;
        for (Products product : shoppingCart){
            total += product.getPrize() * product.getStockQuantity();
        }
        return total;
    }


}
