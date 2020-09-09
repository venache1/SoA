package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static oop.AllUserUtils.filterUsersByCity;
import static oop.AllUserUtils.printUsers;
import static oop.OrderUtils.filterOrdersByItemType;
import static oop.OrderUtils.printOrders;

public class OnlineRetailer {

    public static void main(String[] args) {

        //creating test data:
        List<OrderByAnyUser> orders = new ArrayList<>(); // Array list to contain orders of any type(User orders / Company orders)
        List<AbstractUser> users = new ArrayList<>(); // Array list to contain any type of users (User, Company, AdminUser)
        List<Item> items = new ArrayList<>();

        Item item1 = new Item("dress1", Type.CLOTHES);
        item1.setPrice(400);
        Item item2 = new Item("train", Type.TOYS);
        item2.setPrice(1200);
        Item item3 = new Item("shirt", Type.CLOTHES);
        item3.setPrice(250);

        User user1 = new User("Abrikanda@gmail.lol");
        user1.addAddress("Home", new Address("France", "Nice", "G.Pompidou"));

        UserOrder order1 = new UserOrder();
        order1.setUser(user1);
        order1.addItem(item1);

        AdminUser adminUser2 = new AdminUser("Wakander@grom.com");
        adminUser2.addAddress("Home", new Address("Moldova", "Chisinau", "Eminescu"));

        CompanyOrder order2 = new CompanyOrder();
        order2.setUser(adminUser2);
        order2.addItem(item2);
        order2.addItem(item3);

        Company company3 = new Company("Gerrandjd@faor.com");
        company3.addAddress("Home", new Address("Moldova", "Chisinau", "Libertad"));

        CompanyOrder order3 = new CompanyOrder();
        order3.setCompany(company3);
        order3.addItem(item1);
        order3.addItem(item3);

        System.out.println("Selected order id: " + order3.getId());
        System.out.println("Creation date:" + order3.generateDate());
        System.out.println("Total items in the order: " + order3.count());
        System.out.println("Total number of specific item in the order: " + order3.count(item1));
        System.out.println("Total order amount: " + order3.sum());
        System.out.println("Total amount per item in the order: " + order3.sum(item1));

        Collections.addAll(orders, order1, order2, order3);
        Collections.addAll(users, user1, adminUser2, company3);
        Collections.addAll(items, item1, item2, item3);

        List<OrderByAnyUser> ordersByItemType = filterOrdersByItemType(Type.CLOTHES, orders);
        printOrders(ordersByItemType);

        List<AbstractUser> usersByCity = filterUsersByCity(users, "Chisinau");
        printUsers(usersByCity);
    }
}