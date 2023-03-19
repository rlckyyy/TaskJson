package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.example.Task1.Person;
import org.example.Task2.Book;
import org.example.Task3.Order;
import org.example.Task4.User;
import org.example.Task5.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // firstTask
        Person[] people = new Person[4];
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        Scanner scanner = new Scanner(System.in);
        File file1 = new File("infoPerson.json");
        try {
            people = objectMapper.readValue(file1,new TypeReference<Person[]>() {});
            System.out.println(Arrays.toString(people));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        /// TODO Second task
        File file2 = new File("book.json");
        try {
            Book book = objectMapper.readValue(file2, Book.class);
            System.out.println(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // TODO TASK 3
        List<Order> orders;
        File file3 = new File("orders.json");
        try {
            orders = objectMapper.readValue(file3,new TypeReference<ArrayList<Order>>() {});
            System.out.println(orders);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // TODO TASK 4
        List<User> users;
        File file4 = new File("user.json");
        try {
            users = objectMapper.readValue(file4,new TypeReference<ArrayList<User>>() {});
            System.out.println(users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // TODO TASK 5
        List<Product> products;
        File file5 = new File("product.json");
        try {
            products = objectMapper.readValue(file5, new TypeReference<List<Product>>() {});
            System.out.println(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}