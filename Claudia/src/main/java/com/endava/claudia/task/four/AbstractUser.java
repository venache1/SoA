package com.endava.claudia.task.four;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class AbstractUser {

    private final long id;
    private final String username;
    private Map<String, Address> addressMap;

    public AbstractUser(String username, String addressType, Address address) {
        this.id = Math.abs(new Random().nextLong());
        this.username = username;
        this.addressMap = new HashMap<String, Address>() {{
            put(addressType, address);
        }};
    }
    public long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public Map<String, Address> getAddressMap() {
        return addressMap;
    }
    public void addAddress(String type, Address address) {
        addressMap.put(type, address);
    }
    public boolean containsCity(String city) {
        for (Map.Entry<String, Address> addressEntry : this.addressMap.entrySet()) {
            if (addressEntry.getValue().containsCity(city)) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "User details are: " + "\n" +
                "Id = " + getId() + "\n" +
                "Username = " + getUsername() + "\n" +
                "Addresses are: " + "\n" + addressesToString();
    }
    public String addressesToString() {
        StringBuilder addressString = new StringBuilder();
        for (Map.Entry<String, Address> addressEntry : this.addressMap.entrySet()) {
            addressString.append(addressEntry.getKey()).append("\n").append(addressEntry.getValue().toString()).append("\n");
        }
        return addressString.toString();
        }
}
