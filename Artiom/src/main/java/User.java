import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
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

    public List<Address> containsAdresses() {
        List<Address> tmpAdresses = new ArrayList<>();
        for (Address address : this.addresses.values()) {
            if (address.getCity().equals("Chisinau")) {
                tmpAdresses.add(address);
            }
        }
        return tmpAdresses;
    }
}