package com.OOP_Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Retailer {
    public static void main(String[] args) {

        //Create first order
        Map<String, Address> firstUserAddress = new HashMap<>();
        firstUserAddress.put("Home", new Address("Moldova", "Chisinau", "Stefan cel Mare"));
        User firstUser = new User("Pikachu", firstUserAddress);
        List<Item> firstItemList = new ArrayList<>();
        firstItemList.add(new Item("iPhone", Type.GADGET));
        Order firstOrder = new Order(firstUser, firstItemList);

        //Create second order
        Map<String, Address> secondUserAddress = new HashMap<>();
        secondUserAddress.put("Home", new Address("Ukraine", "Kyiv", "Verkhnia Street"));
        User secondUser = new User("Slowpoke", secondUserAddress);
        List<Item> secondItemList = new ArrayList<>();
        secondItemList.add(new Item("Pants", Type.CLOTHES));
        Order secondOrder = new Order(secondUser, secondItemList);

        //Create third order
        Map<String, Address> thirdUserAddress = new HashMap<>();
        thirdUserAddress.put("Work", new Address("Romania", "Bucharest", "Rope Street"));
        User thirdUser = new User("Bulbasaur", thirdUserAddress);
        List<Item> thirdListItem = new ArrayList<>();
        thirdListItem.add(new Item("Buzz Lighter", Type.TOY));
        Order thirdOrder = new Order(thirdUser, thirdListItem);

        //Create list of orders
        List<Order> orders = new ArrayList<>();
        orders.add(firstOrder);
        orders.add(secondOrder);
        orders.add(thirdOrder);

        //Create list of Users
        List<User> users = new ArrayList<>();
        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);

    }

    //Create method to filter orders by CLOTHES type
    public static List<Order> filterOrdersByType(List<Order> orders, Type type) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order filteredOrder : orders) {
            if (filteredOrder.contains(Type.CLOTHES)) {
                filteredOrders.add((Order) orders);
            }
        }
        return filteredOrders;
    }

    //Create method to filter users by Chisinau city
    public static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> filteredUsers = new ArrayList<>();
        for (User filteredUser : users) {
            if (filteredUser.contains("Chisinau")) {
                filteredUsers.add((User) users);
            }
        }
        return filteredUsers;
    }
}

