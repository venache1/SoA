package onlineRetailer;

import java.util.ArrayList;
import java.util.Random;

public class Item {

    private long id;

     static int getNrOfItems() {
        return nrOfItems;
    }

     ArrayList<String> getItem() {
        return item;
    }

    private String title;
    private Type type;
    private static int nrOfItems = 0;

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public static void setNrOfItems(int nrOfItems) {
        Item.nrOfItems = nrOfItems;
    }

    public void setItem(ArrayList<String> item) {
        this.item = item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

     double getPrice() {
        return price / 100;
    }

    private double price;
    ArrayList<String> item = new ArrayList<String>();

     Item(long id, String title, Type type) {
        this.price = new Random(10000).nextLong();
        this.id = id;
        this.title = title;
        this.type = type;
        nrOfItems++;
        item.add(title);
    }

    public long getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public int getItemsNr() {
        return item.size();
    }

}
