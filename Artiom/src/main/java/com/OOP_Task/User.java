package com.OOP_Task;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Random;

public class User {
    public long id;
    public String username;
    public Map<String, Address> addresses;
    private AbstractMap<Object, Object> addressMap;

    public User(String username, Map<String, Address> addresses) {
        this.id = new Random().nextLong();
        this.username = username;
        this.addresses = addresses;
    }

    public boolean contains(String chisinau) {
        for (Address city : this.addresses.values()) {
            if (city.getCity().equals("Chisinau")) {
                return true;
            }
            return false;
        }
        return false;
    }
}



