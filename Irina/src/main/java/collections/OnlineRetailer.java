package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnlineRetailer {

    public static void main(String[] args) {

        //creating test data:

        List<Order> orders = new ArrayList<>();
        List<User> users = new ArrayList<>();
        List<Item> items = new ArrayList<>();

        User user1 = new User("Abrikanda@gmail.lol");
        user1.addAddress("Home", new Address("France", "Nice", "G.Pompidou"));

        Item item1 = new Item("dress1", Type.CLOTHES);

        Order order1 = new Order();
        order1.user = user1;
        order1.addItem(item1);

        User user2 = new User("Wakander@grom.com");
        user2.addAddress("Home", new Address("Moldova", "Chisinau", "Eminescu"));

        Item item2 = new Item("train", Type.TOYS);
        Item item3 = new Item("shirt", Type.CLOTHES);

        Order order2 = new Order();
        order2.user = user2;
        order2.addItem(item2);
        order2.addItem(item3);

        User user3 = new User("Gerrandjd@faor.com");
        user3.addAddress("Home", new Address("Moldova", "Chisinau", "Libertad"));

        Order order3 = new Order();
        order3.user = user3;
        order3.addItem(item1);
        order3.addItem(item3);

        Collections.addAll(orders, order1, order2, order3);
        Collections.addAll(users, user1, user2, user3);
        Collections.addAll(items, item1, item2, item3);

        List<Order> ordersByItemType = filterOrdersByItemType(Type.CLOTHES, orders);
        OnlineRetailer.printOrders(ordersByItemType);

        List<User> usersByCity = filterUsersByCity(users, "Chisinau");
        OnlineRetailer.printUsers(usersByCity);

    }

    public static List<Order> filterOrdersByItemType(Type type, List<Order> persOrders) {
        List<Order> tmpOrders = new ArrayList();
        for (int i = 0; i < persOrders.size(); i++) {
            if (persOrders.get(i).filterItemsByType(type).size() > 0) {
                tmpOrders.add(persOrders.get(i));
            }
        }
        return tmpOrders;
    }

    public static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> tmpUsersByCity = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).isHomeCity(city)) {
                tmpUsersByCity.add(users.get(i));
            }
        }
        return tmpUsersByCity;
    }

    public static void printUsers(List<User> usersList) {
        for (User usr : usersList) {
            System.out.println(usr.toString());
        }
    }

    public static void printOrders(List<Order> orders) {
        for (Order ord : orders) {
            System.out.println(ord.toString());
        }
    }
}