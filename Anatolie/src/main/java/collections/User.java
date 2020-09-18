package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User {
    public long id;
    public String username;
    public Map<String, Address> addresses = new HashMap<>();

    public User(String username) {
        this.id = new Random().nextLong();
        this.username = username;
    }

    public void addAddress(String type, Address address) {
        this.addresses.put(type, address);
    }

    public boolean IsHomeCity(String city) {
        return addresses.get("Home").city.equals(city);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username='" + username + '\'' + ", adresses+" + addresses + '}';
    }
}
