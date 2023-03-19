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

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public OrderItem getItems() {
        return items;
    }

    public void setItems(OrderItem items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order id" + id + ", date: " + date + ",items: " + items;
    }
}
