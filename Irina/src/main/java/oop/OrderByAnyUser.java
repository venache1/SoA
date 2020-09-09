package oop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderByAnyUser implements Order {

    private final long id = new Random().nextLong();
    private LocalDateTime date = LocalDateTime.now();
    private List<Item> items;
    private AbstractUser user;

    public OrderByAnyUser() {
        this.items = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public AbstractUser getUser() {
        return user;
    }

    public void setUser(AbstractUser user) {
        this.user = user;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public int sum() {
        int sumItems = 0;
        for ( int i = 0; i < this.items.size(); i++ ) {
            sumItems = sumItems + items.get(i).getPrice();
        }
        return sumItems;
    }

    public int sum(Item item) {
        int sumPerItem = 0;
        for ( int i = 0; i < this.items.size(); i++ ) {
            if (items.get(i).getId() == item.getId()) sumPerItem += items.get(i).getPrice();
        }
        return sumPerItem;
    }

    @Override
    public int count() {
        return this.items.size();
    }

    public int count(Item item) {
        int count = 0;
        for ( int i = 0; i < items.size(); i++ ) {
            if (items.get(i).getId() == item.getId()) count++;
        }
        return count;
    }

    @Override
    public LocalDateTime generateDate() {
        return this.date;
    }

    @Override
    public List<Item> filterItemsByType(Type type) {
        List<Item> tmpItems = new ArrayList();
        for ( int i = 0; i < this.items.size(); i++ ) {
            if (items.get(i).getType() == type) {
                tmpItems.add(items.get(i));
            }
        }
        return tmpItems;
    }
}