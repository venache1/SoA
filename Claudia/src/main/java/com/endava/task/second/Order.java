package com.endava.task.second;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class Order {
    public long id;
    public LocalDateTime dateTime;
    public User user;
    public List<Item> items;

    public Order(User user, List<Item> items) {
        this.id = Math.abs(new Random().nextLong());
        this.dateTime = LocalDateTime.now();
        this.user = user;
        this.items = items;

    }

    public boolean containsType(Type type) {
        for (Item item : this.items) {
            if (item.getType() == type) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Order ID is: " + "\n" + this.id + "\n" +
                "DateTime created is: " + this.dateTime + "\n" +
                "The items are: " + itemsToString();
    }

    public String itemsToString() {
        StringBuilder itemsString = new StringBuilder();
        for (Item item : this.items) {
            itemsString.append(item.toString());
        }
        return itemsString.toString();

    }

}
