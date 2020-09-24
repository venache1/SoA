package onlineRetailer;

public class User extends AbstractUser{


    public User(String username, Address address, long id) {
        super(username, address, id, AddressType.HOME);
    }
}
