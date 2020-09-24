package onlineRetailer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemUtils {
    public static List<Item> createItemList() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(0, "Samsung Note 20", Type.GADGET));
        items.add(new Item(1, "Samsung S 20", Type.GADGET));
        items.add(new Item(2, "Samsung Note 20 Ultra", Type.GADGET));
        items.add(new Item(3, "Samsung S 20 Ultra", Type.GADGET));
        items.add(new Item(4, "Xiaomi Mi 10", Type.GADGET));
        items.add(new Item(5, "Xiaomi Mi Note 10", Type.GADGET));
        items.add(new Item(6, "Xiaomi Mi 10 Lite", Type.GADGET));
        items.add(new Item(7, "Levi's", Type.CLOTHES));
        items.add(new Item(8, "Fidget Spinner", Type.TOYS));
        items.add(new Item(9, "Polo Shirt", Type.CLOTHES));

        return items;
    }


    public static Map<Long, Item> getItemsAsMap() {
        List<Item> itemList = createItemList();
        Map<Long, Item> map = new HashMap<>();

        for ( Item it : itemList ) {
            map.put(it.getId(), it);
        }
        return map;
    }
}
