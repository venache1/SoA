package com.collections;

public class Address {
    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }
    public String country;
    public String city;
    public String street;
    public String getFullAddress() {
        return country + ", " + city + ", " + street;
    }
}