package com.endava.claudia.task.four;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {

    public static void main(String[] args) {

        List<Order> myOrders = new ArrayList<>();
        List<AbstractUser> userList = new ArrayList<>();

        User user1 = new User("Jhon", "Home", new Address("Moldova", "Chisinau", "Mircea cel Batran"));

        AbstractUser user2 = new User("Catalina", "Home", new Address("Romania", "Bucuresti","Militarilor 22"));
        user2.addAddress("Office", new Address("Moldova", "Cahul", "Eliade 32"));

        AdminUser admin = new AdminUser("Admin", "Office", new Address("Moldova", "Chisinau", "Eliade 38"));

        List<Item> itemList1 = new ArrayList<>();
        itemList1.add(new Item("Dress", Type.CLOTHES, 15.00));
        itemList1.add(new Item("Earings", Type.ACCESSORIES, 20.00));

        List<Item> itemList2 = new ArrayList<>();
        itemList2.add(new Item("Cars", Type.TOYS, 42.99));
        itemList2.add(new Item("Rings", Type.ACCESSORIES, 30.99));

        List<Item> itemList3 = new ArrayList<>();
        Item item1 = new Item("USB Cable", Type.ACCESSORIES, 50);
        Item item2 = new Item("Micro SD", Type.ACCESSORIES, 23.5);
        itemList3.add(item1);
        itemList3.add(item2);

        UserOrder order1 = new UserOrder(user1, itemList1);
        UserOrder order2 = new UserOrder(user2, itemList2);

        CompanyOrder companyOrder = new CompanyOrder(new Company("Nokia Phone Shop"), itemList3);

        myOrders.add(order1);
        myOrders.add(order2);
        myOrders.add(companyOrder);

        userList.add(user1);
        userList.add(user2);
        userList.add(admin);

        System.out.println("Orders that contains CLOTHES are : ");
        for (Order order : getOrdersWithItemType(myOrders, Type.CLOTHES)) {
            System.out.println("------------------------");
            System.out.println(order);;
        }

        System.out.println(); // for a new line
        System.out.println("Users from Chisinau are : ");
        for (AbstractUser user : getUserFromCity(userList, "Chisinau")) {
            System.out.println("------------------------");
            System.out.println(user);;
        }

        System.out.println();
        admin.approveOrder(order1);
        admin.rejectOrder(order2);
        admin.approveOrder(companyOrder);

        System.out.println();
        System.out.println("Order1 creation date: " + order1.date());
        System.out.println("Company Order creation date: " + companyOrder.date());

        System.out.println("\nCompany Order: ");
        System.out.printf("Count of item %s : %d\n", item1.getTitle(), companyOrder.count(item1));
        System.out.printf("Price sum of item %s : $%.2f\n", item2.getTitle(), companyOrder.sum(item2));

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

    public static List<AbstractUser> getUserFromCity(List<AbstractUser> users, String city) {
        List<AbstractUser> filteredUsers = new ArrayList<>();
        for (AbstractUser user : users) {
            if (user.containsCity(city)) {
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }
}
