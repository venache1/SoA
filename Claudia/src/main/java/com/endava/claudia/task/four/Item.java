package com.endava.claudia.task.four;

import java.util.Random;

public class Item {

    private final long id;
    private String title;
    private Type type;
    private double price;

    public Item(String title, Type type, double price) {
        this.id = Math.abs(new Random().nextLong());
        this.title = title;
        this.type = type;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String toString() {
        return "Id =" + this.id + "\n" +
                "Title =" + this.title + "\n" +
                "Type =" + this.type + "\n";
    }
}
