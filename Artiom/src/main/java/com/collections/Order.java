package com.collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    public long id;
    public LocalDateTime date;
    public com.collections.User user;
    public List<com.collections.Item> items;
public Order(String user) {
    this.id = new Random().nextLong();
    this.date = LocalDateTime.now();
    this.items = new ArrayList<>();
}


}