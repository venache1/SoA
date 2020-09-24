package onlineRetailer;

import java.util.ArrayList;
import java.util.List;

import static onlineRetailer.ItemUtils.createItemList;
import static onlineRetailer.Type.*;

public class CompanyOrder extends AbstractOrder {

    public CompanyOrder(String username, Type type, Item item) {
        super(username, type, item);
    }

    public static List<CompanyOrder> createListOfCompanyOrders() {
        List<Item> itemList = createItemList();
        List<CompanyOrder> companyOrders = new ArrayList<>();
        companyOrders.add(new CompanyOrder("Katana", GADGET, itemList.get(0)));
        companyOrders.add(new CompanyOrder("Star", GADGET, itemList.get(2)));
        companyOrders.add(new CompanyOrder("Computer Systems", GADGET, itemList.get(6)));
        companyOrders.add(new CompanyOrder("Macros", CLOTHES, itemList.get(7)));
        companyOrders.add(new CompanyOrder("Fast Track", CLOTHES, itemList.get(9)));
        companyOrders.add(new CompanyOrder("Cioco", TOYS, itemList.get(8)));
        return companyOrders;
    }

    public static List<UserOrder> createListOfUserOrders() {
        List<Item> itemList = createItemList();
        List<UserOrder> userOrders = new ArrayList<>();
        userOrders.add(new UserOrder("Katana", GADGET, itemList.get(0)));
        userOrders.add(new UserOrder("Star", GADGET, itemList.get(2)));
        userOrders.add(new UserOrder("Computer Systems", GADGET, itemList.get(6)));
        userOrders.add(new UserOrder("Macros", CLOTHES, itemList.get(7)));
        userOrders.add(new UserOrder("Fast Track", CLOTHES, itemList.get(9)));
        userOrders.add(new UserOrder("Cioco", TOYS, itemList.get(8)));
        return userOrders;
    }
}
