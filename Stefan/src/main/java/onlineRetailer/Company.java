package onlineRetailer;

public class Company extends AbstractUser {
    public Company (String username, Address address, long id) {
        super(username, address, id, AddressType.OFFICE);
    }
}
