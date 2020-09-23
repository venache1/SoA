package com.endava.task.second;

import java.util.Random;

public class Item {
    public long id;
    public String title;
    public Type type;

    public Type getType() {
        return type;
    }

    public Item(String title, Type type) {
        this.id = Math.abs(new Random().nextLong());
        this.title = title;
        this.type = type;
    }

    public String toString() {
        return "Id =" + this.id + "\n" +
                "Title =" + this.title + "\n" +
                "Type =" + this.type + "\n";
    }
}
