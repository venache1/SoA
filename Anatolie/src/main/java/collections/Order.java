package collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    public long id;
    public LocalDateTime date;
    public User user;
    public List<Item> items;

    public Order() {
        this.id = new Random().nextLong();
        this.date = LocalDateTime.now();
        this.items = new ArrayList<Item>();
    }
}
