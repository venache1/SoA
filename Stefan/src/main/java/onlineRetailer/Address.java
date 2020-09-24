package onlineRetailer;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String country;

    private String city;

    private String street;

     Address(String country, String city, String street) {
        this.city = city;
        this.country = country;
        this.street = street;
    }
    public static List<Address> createListOfAddresses(String country, String city, Address street) {

        List<Address> addressList = new ArrayList<>();
        Address address2 = new Address("Moldova","Chisinau","Dacia");
     addressList.add(address2);
     addressList.add(new Address("Romania","Bucharest","Unirii"));
        return addressList;
    }

     String getFullAddress() {
        return (country+ " " +city + street);
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
