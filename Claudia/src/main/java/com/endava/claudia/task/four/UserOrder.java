package com.endava.claudia.task.four;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class UserOrder implements Order {

    private final long id;
    private final LocalDateTime dateTime;
    private AbstractUser user;
    private List<Item> items;

    public UserOrder(AbstractUser user, List<Item> items) {
        this.id = Math.abs(new Random().nextLong());
        this.dateTime = LocalDateTime.now();
        this.user = user;
        this.items = items;
    }

    public AbstractUser getUser() {
        return user;
    }

    public void setUser(AbstractUser user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String toString() {
        return "Order ID is: " + "\n" + this.id + "\n" +
                "DateTime created is: " + this.dateTime + "\n" +
                "Count: " + count() + "\n" +
                "Sum: $" + sum() + "\n" +
                "The items are: " + itemsToString();
    }

    @Override
    public boolean containsType(Type type) {
        for (Item item : this.items) {
            if (item.getType() == type) {
                return true;
            }
        }
        return false;
    }

    public String itemsToString() {
        StringBuilder itemsString = new StringBuilder();
        for (Item item : this.items) {
            itemsString.append(item.toString());
        }
        return itemsString.toString();

    }

    @Override
    public double sum() {
        double sum = 0d;
        for (Item i : items) {
            sum += i.getPrice();

        }
        return sum;
    }

    @Override
    public int count() {
        return items.size();
    }

    @Override
    public LocalDateTime date() {
        return dateTime;
    }

    public double sum(Item item) {
        double sum = 0d;
        for (Item i : items) {
            if (i.getId() == item.getId()) {
                sum += i.getPrice();
            }
        }
        return sum;
    }

    public int count(Item item) {
        int count = 0;
        for (Item i : items) {
            if (i.getId() == item.getId()) {
                count++;
            }
        }
        return count;
    }
    public long getId() {
        return id;
    }

}
