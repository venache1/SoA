package onlineRetailer;

import java.util.ArrayList;
import java.util.List;

import static onlineRetailer.ItemUtils.createItemList;
import static onlineRetailer.Type.*;

public class OrderUtils {

    private static long id = 0;

    public static long getOrderId() {
        return id++;
    }
    public List<UserOrder> getOrdersByType(Type type){
        List<UserOrder> userOrders = createListOfOrders();
        List<UserOrder> ordersByType = new ArrayList<>();
        for(int i=0; i < userOrders.size();i++ ){
            if(type.equals(userOrders.get(i))){
                ordersByType.add(userOrders.get(i));
            }
        }
        return ordersByType;
    }

    public static List<UserOrder> createListOfOrders() {
        List<Item> itemList = createItemList();
        List<UserOrder> userOrders = new ArrayList<>();
        userOrders.add(new UserOrder("Jora", GADGET, itemList.get(0)));
        userOrders.add(new UserOrder("Man", GADGET, itemList.get(2)));
        userOrders.add(new UserOrder("Lenin", GADGET, itemList.get(6)));
        userOrders.add(new UserOrder("samurai", CLOTHES, itemList.get(7)));
        userOrders.add(new UserOrder("Che", CLOTHES, itemList.get(9)));
        userOrders.add(new UserOrder("Jiro", TOYS, itemList.get(8)));
        return userOrders;
    }
}
