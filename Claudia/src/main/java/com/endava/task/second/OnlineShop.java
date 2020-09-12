package com.endava.task.second;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    public static void main(String[] args) {
        List<Order> myOrders = new ArrayList<>();
        List<User> userList = new ArrayList<>();
        User user1 = new User("Jhon", "Home", new Address("Moldova", "Chisinau", "Mircea cel Batran"));
        User user2 = new User("Catalina", "Office", new Address("Moldova", "Cahul", "Eliade 32"));

        List<Item> itemList1 = new ArrayList<>();
        itemList1.add(new Item("Dress", Type.CLOTHES));
        itemList1.add(new Item("Earings", Type.ACCESSORIES));

        List<Item> itemList2 = new ArrayList<>();
        itemList2.add(new Item("Cars", Type.TOYS));
        itemList2.add(new Item("Rings", Type.ACCESSORIES));

        Order order1 = new Order(user1, itemList1);  //create 2 object of Order type
        Order order2 = new Order(user2, itemList2);

        myOrders.add(order1);
        myOrders.add(order2);

        user1.addAddress("Home2", new Address("England", "London", "Cannon 21"));
        userList.add(user1);
        userList.add(user2);

        System.out.println("Orders that contains CLOTHES are : ");
        for (Order order : getOrdersWithItemType(myOrders, Type.CLOTHES)) {
            System.out.println(order);
            ;
        }
        System.out.println("Users from Chisinau are : ");
        for (User user : getUserFromCity(userList, "Chisinau")) {
            System.out.println(user);
        }
    }

    public static List<Order> getOrdersWithItemType(List<Order> orders, Type type) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.containsType(type)) {
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
    }

    public static List<User> getUserFromCity(List<User> users, String city) {
        List<User> filteredUsers = new ArrayList<>();
        for (User user : users) {
            if (user.containsCity(city)) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }
}
