package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity; // o "this.quantity" se refere ao quantity da classe
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
}
