package org.example.Task4;

public class Address {
    private String street;
    private String city;
    private String zip;

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Address city:" + city + ", street: " + street + ", postal code: " + zip;
    }
}
