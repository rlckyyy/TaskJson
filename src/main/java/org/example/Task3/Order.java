package org.example.Task3;

import java.time.LocalDate;

public class Order {
    private int id;
    private LocalDate date;
    private OrderItem items;

    public Order(int id, LocalDate date, OrderItem items) {
        this.id = id;
        this.date = date;
        this.items = items;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }


    public LocalDate getDate() {
        return date;
    }


    public OrderItem getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order id" + id + ", date: " + date + ",items: " + items;
    }
}
