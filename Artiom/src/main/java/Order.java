import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    public long id;
    public LocalDateTime date;
    public User user;
    public List<Item> items;

    public Order(User user, List<Item> items) {
        this.id = new Random().nextLong();
        this.date = LocalDateTime.now();
        this.user = user;
        this.items = items;
    }

    public List<Item> containsClothes() {
        List<Item> tmpItems = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getType() == Type.CLOTHES) {
                tmpItems.add(item);
            }
        }
        return tmpItems;
    }
}