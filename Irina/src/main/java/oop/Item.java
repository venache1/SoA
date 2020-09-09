package oop;

import java.util.Random;

public class Item {
    private long id;
    private String title;
    private Type type;
    private int price;

    public Item(String title, Type type) {
        this.id = new Random().nextLong();
        this.title = title;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Please enter valid price");
        }
    }
}