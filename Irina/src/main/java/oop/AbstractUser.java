package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

abstract class AbstractUser {
    private long id = new Random().nextLong();
    private final String name;
    private Map<String, Address> addresses = new HashMap<>();

    public AbstractUser(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addAddress(String key, Address address) {
        this.addresses.put(key, address);
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    public boolean isHomeCity(String city) {
        return addresses.get("Home").getCity().equals(city);
    }
}