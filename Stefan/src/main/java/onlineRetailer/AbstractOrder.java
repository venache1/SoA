package onlineRetailer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static onlineRetailer.OrderUtils.getOrderId;

public abstract class AbstractOrder implements Order {
    public long id = 0;
    private Type type;
    private LocalDate date;
    private String username;
    private ArrayList<Item> items;

    public AbstractOrder(String username, Type type, Item item) {
        items = new ArrayList<>();
        this.username = username;
        items.add(item);
        this.id = getOrderId();
        this.type = type;
    }

    @Override
    public long sum(AbstractOrder abstractOrder) {
        long sum = 0;
        for ( Item i : abstractOrder.items ) {
            sum += i.getPrice();
        }
        return sum;

    }

    @Override
    public int count(List<AbstractOrder> orders) {

        int count = 0;
        for ( int i = 0; i < orders.size(); i++ ) {
            if (orders.get(i).getUsername().equals(username)) {
                count++;
            }
        }
        System.out.println("The User: " + username + " has " + count + " orders.");
        return count;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getItemNames() {
        String result = "";
        for ( Item i : items ) {
            result += i.getTitle() + " ";
        }
        return result;
    }
    public void getAllOrders(String username, List<AbstractOrder> userOrders) {
        System.out.println("Orders for " + username + " are: ");
        for ( AbstractOrder u : userOrders ) {
            if (u.username.equals(username)) {
                System.out.println(u.items);
            }
        }
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
@Override
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
