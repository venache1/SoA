package com.OOP_Task;

import java.time.LocalDateTime;
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


    public boolean contains(Type clothes) {
        for (Item item : this.items) {
            if (item.getType() == Type.CLOTHES) {
                return true;
            }
            return false;
        }
        return false;
    }
}
