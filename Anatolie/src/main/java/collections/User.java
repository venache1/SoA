package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User {
    public long id;
    public String username;
    public Map<String, Address> addresses = new HashMap<>();//(Key="Home",Value =Address)

    public User(String username) {
        this.id = new Random().nextLong();
        this.username = username;
    }

    public boolean IsHomeCity(String city) {
        return addresses.get("Home").city.equals(city);
    }
}
