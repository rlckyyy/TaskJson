package org.example.Task5;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private List<Review> reviews;

    public Product(int id, String name, double price, String description, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.reviews = reviews;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Product id: " + id + ", name: " + name + ", price: " + price + ", reviews: " + reviews;
    }
}
