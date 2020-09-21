package com.endava.claudia.task.four;

public class Address {

    private String country;
    private String city;
    private String street;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}

