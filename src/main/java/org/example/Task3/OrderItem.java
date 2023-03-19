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


    public int getQuantity() {
        return quantity;
    }



    @Override
    public String toString() {
        return "OrderItem id: " + productID + ", quantity: " + quantity;
    }
}
