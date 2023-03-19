package org.example.Task3;

public class OrderItem {
    private int productID;
    private int quantity;

    public OrderItem(int productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }

    public OrderItem() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem id: " + productID + ", quantity: " + quantity;
    }
}
