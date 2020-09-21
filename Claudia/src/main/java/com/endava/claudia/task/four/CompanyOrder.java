package com.endava.claudia.task.four;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class CompanyOrder implements Order {

    public long id = 1;
    public LocalDateTime dateTime;
    public Company company;
    public List<Item> items;

    public CompanyOrder(Company company, List<Item> items) {
        this.id = Math.abs(new Random().nextLong());
        this.dateTime = LocalDateTime.now();
        this.company = company;
        this.items = items;
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
    public String toString() {
        return "Order ID is : " + this.id + "\n" +
                "DateTime created is : " + this.dateTime + "\n" +
                "Company : " + this.company + "\n" +
                "Count : " + this.count() + "\n" +
                "Sum : $ " + this.sum() + "\n" +
                "The items are : " + itemsToString();
    }
    public String itemsToString() {
        StringBuilder itemsString = new StringBuilder();
        for(Item item : this.items) {
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
