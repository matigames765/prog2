public class Products {
    private String name;

    private double prize;

    private int stockQuantity;

    public Products(String name, double prize, int stockQuantity) {
        this.name = name;
        this.prize = prize;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String toString(){
        return "Nombre del producto: " + name + ", Precio: " + prize + ", Stock: " + stockQuantity;
    }
}
