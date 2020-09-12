package com.endava.task.second;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User {
    public long id;
    public String username;
    public Map<String, Address> addressMap;

    public User(String username, String addressType, Address address) {
        this.id = Math.abs(new Random().nextLong());
        this.username = username;
        this.addressMap = new HashMap<String, Address>() {{
            put(addressType, address);
        }};

    }

    public Map<String, Address> addAddress(String type, Address address) {
        this.addressMap.put(type, address);
        return this.addressMap;
    }

    public String toString() {
        return "User details are : " + " \n" +
                " Id =" + this.id + " \n" +
                " Username =" + this.username + " \n" +
                " Addresses are: " + " \n" + addressesToString();
    }

    public String addressesToString() {
        StringBuilder addressString = new StringBuilder();
        for (Map.Entry<String, Address> addressEntry : this.addressMap.entrySet()) {
            addressString.append(addressEntry.getKey()).append("\n").append(addressEntry.getValue().toString()).append("\n");

        }
        return addressString.toString();
    }

    public boolean containsCity(String city) {
        for (Map.Entry<String, Address> addressEntry : this.addressMap.entrySet()) {
            if (addressEntry.getValue().containsCity(city)) {
                return true;
            }
        }
        return false;
    }

}

