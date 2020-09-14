package collections;

import javax.jws.soap.SOAPBinding;

public class OnlineRetailer {
    public static void main(String[] args) {
        String test = new String();
        Order orderOne = new Order();
        User user01 = new User("Alex");
        Item tshort = new Item("white t-short", Type.CLOTHES);
        orderOne.user = user01;
        orderOne.items.add(tshort);
        user01.addresses.put("Home", new Address("Moldova", "Chisinau","Ismail"));

    }
}
