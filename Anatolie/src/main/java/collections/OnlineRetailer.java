package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnlineRetailer {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        Order orderOne = new Order();
        User user01 = new User("Alex");
        user01.addAddress("Home", new Address("Moldova", "Chisinau", "Ismail"));
        Item smartPhone = new Item("Iphone", Type.GADGETS);
        orderOne.user = user01;
        orderOne.items.add(smartPhone);

        User user02 = new User("Bob");
        user02.addAddress("Home", new Address("Oceania", "Great reef", "Bikini Bottom"));
        Item pants = new Item("Square pants", Type.CLOTHES);
        Order orderTwo = new Order();
        orderTwo.user = user02;
        orderTwo.items.add(pants);

        User user03 = new User("Mark");
        user03.addAddress("Home", new Address("Moldova", "Chisinau", "Dacia"));
        Item ball = new Item("Orange Ball", Type.TOYS);
        Order orderThree = new Order();
        orderThree.user = user03;
        orderThree.items.add(ball);

        Collections.addAll(users, user01, user02, user03);
        Collections.addAll(items, smartPhone, pants, ball);
        Collections.addAll(orders, orderOne, orderTwo, orderThree);

        List<User> usersCity = filterUserByCity(users, "Chisinau");
        OnlineRetailer.printUsers(usersCity);

        List<Order> ordersByItemType = filterOrderByItemType(Type.CLOTHES, orders);
        OnlineRetailer.printOrders(ordersByItemType);
    }

    public static List<User> filterUserByCity(List<User> users, String city) {
        List<User> tmpUsersByCity = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).IsHomeCity(city)) {
                tmpUsersByCity.add(users.get(i));
            }
        }
        return tmpUsersByCity;
    }

    public static void printUsers(List<User> usersList) {
        List<User> tmpUsersByCity = new ArrayList<>();
        for (int i = 0; i < usersList.size(); i++) {
            System.out.println(usersList.get(i).toString());
        }
    }

    public static List<Order> filterOrderByItemType(Type type, List<Order> persOrders) {
        List<Order> tmpOrders = new ArrayList<>();
        for (int i = 0; i < persOrders.size(); i++) {
            if (persOrders.get(i).filteItemsByType(type).size() > 0) {
                tmpOrders.add(persOrders.get(i));
            }
        }
        return tmpOrders;
    }

    public static void printOrders(List<Order> orders) {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i).toString());
        }
    }
}