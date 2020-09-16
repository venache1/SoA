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

    public List<Item> filteItemsByType(Type type) {
        List<Item> tmpItems = new ArrayList<>();
        for (int i = 0; i < this.items.size(); i++) {
            if (items.get(i).type == type) {
                tmpItems.add(items.get(i));
            }
        }
        return tmpItems;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", date=" + date + ", user=" + user + ", items=" + items + '}';
    }
}
