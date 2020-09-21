package com.OOP_Task;

public class Address {
    public String country;
    public String city;
    public String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getFullAddress() {
        return country + ", " + city + ", " + street;
    }


}

