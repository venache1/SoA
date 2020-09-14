package onlineRetailer;

import java.util.EnumMap;

import static onlineRetailer.AddressType.HOME;

public abstract class AbstractUser {

    private final String username;
    private EnumMap<AddressType, Address> addresses;
    private long id;

    public AbstractUser(String username, Address address, long id, AddressType addressType) {
        addresses = new EnumMap<>(AddressType.class);
        this.addresses.put(addressType, address);
        this.username = username;
        this.id = id;
    }

    public long getUserId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public EnumMap<AddressType, Address> getAddresses() {
        if (addresses.get(HOME) == null) {
            addAddress(AddressType.HOME, new Address(null, null, null));
        }
        return addresses;
    }

    public void removeAddress(AddressType type) {
        addresses.remove(type);
    }

    public void addAddress(AddressType addressType, Address newAddress) {
        addresses.put(addressType, newAddress);
    }
}
