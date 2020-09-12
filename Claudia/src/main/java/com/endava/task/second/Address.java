package com.endava.task.second;

public class Address {
    public String country;
    public String city;
    public String street;

    public Address(String country, String city, String street) {
        this.city = city;
        this.country = country;
        this.street = street;
    }

    public boolean containsCity(String city) {
        boolean containsCity = false;
        if (this.city.equals(city)) {
            containsCity = true;
        }
        return containsCity;
    }

    public String toString() {
        return this.country + ", " + this.city + ", " + this.street;
    }
}

