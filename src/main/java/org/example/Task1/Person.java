package org.example.Task1;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Person ID:" + id + ", NAME: " + name + ", AGE: " + age;
    }
}
