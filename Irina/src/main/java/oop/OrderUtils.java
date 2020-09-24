package oop;

import java.util.ArrayList;
import java.util.List;

public class OrderUtils {
    public static List<OrderByAnyUser> filterOrdersByItemType(Type type, List<OrderByAnyUser> persOrders) {
        List<OrderByAnyUser> tmpOrders = new ArrayList();
        for ( int i = 0; i < persOrders.size(); i++ ) {
            if (persOrders.get(i).filterItemsByType(type).size() > 0) {
                tmpOrders.add(persOrders.get(i));
            }
        }
        return tmpOrders;
    }

    public static void printOrders(List<OrderByAnyUser> listOfOrders) {
        for ( int i = 0; i < listOfOrders.size(); i++ ) {
            System.out.println("Order ID having item type: " + listOfOrders.get(i).getId());
        }
    }
}