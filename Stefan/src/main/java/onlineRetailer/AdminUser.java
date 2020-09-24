package onlineRetailer;

public class AdminUser extends AbstractUser {

    public AdminUser(String username, Address address, long id) {
        super(username, address, id, AddressType.TEMPORARY);
    }

    void approveOrder(Order order){
        System.out.println("OApproved");
    }
    void rejectOrder(Order order){
        System.out.println("Rejected");
    }
}
