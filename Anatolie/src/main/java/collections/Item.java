package collections;

import java.util.Random;

public class Item {
    public long id;
    public String title;
    public Type type;

    public Item(String title, Type type) {
        this.id = new Random().nextLong();
        this.title = title;
        this.type = type;
    }
}