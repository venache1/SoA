package onlineRetailer;

import java.util.List;

import static onlineRetailer.AddressType.HOME;
import static onlineRetailer.CompanyOrder.createListOfCompanyOrders;
import static onlineRetailer.CompanyOrder.createListOfUserOrders;
import static onlineRetailer.UserUtils.createListOfUsers;

public class OnlineStore {
    public static void main(String[] args) {
        //System.out.println("Welcome to the Online Store \n Menu: \n 1. Create a new User \n 2. Select an existing username");
        displayAllTypesOfItems();

        Address address = new Address("Chisinau", "Moldova", "Dacia");
        List<User> users = createListOfUsers();
        //System.out.println("Total number of users is: " + users.size());
        getAllUsers(users);
        //System.out.println("All users are: " + users.get(u));
        getUsersFromCity("Tokyo", users);
        getUsersPrettyStyle("Kenya", users);
        List<CompanyOrder> companyOrders= createListOfCompanyOrders();
        //getAllOrders(users);
        Item note20 = new Item(001, "Samsung Note 20", Type.GADGET);

        List<UserOrder> userOrders = createListOfUserOrders();

        getUsersFullAddress("Jiro", users);
        printOrdersByType(userOrders,Type.CLOTHES);
    }





    public static void getUsersFromCity(String userCity, List<User> users) {
        System.out.println("Users from " + userCity + " are: ");
        for ( User u : users ) {
            Address userAddress = u.getAddresses().get(HOME);
            if (userCity.equals(u.getAddresses().get(HOME).getCity())) {
                System.out.println(u.getUsername());
            }
        }
    }

    public static void getAllUsers(List<User> users) {
        System.out.println("All users are: ");
        for ( int u = 0; u < users.size(); u++ ) {
            System.out.println(users.get(u).getUsername());
        }
    }

    public static void getUsersPrettyStyle(String userCountry, List<User> users) {
        System.out.println("The users from " + userCountry + " are: ");
        users.stream()
                .filter(u -> u.getAddresses().get(HOME) != null && userCountry.equals(u.getAddresses().get(HOME).getCountry()))
                .map(AbstractUser::getUsername)
                .forEach(System.out::println);
    }



    public void addUserAddress(Address country, Address city, Address street) {
        Address address1 = new Address("Moldova", "Chisinau", "Dacia");
    }



    private static void printOrdersByType(List<UserOrder> userOrders, Type type) {
        System.out.println("The Orders from the Category " + type + " are: ");
        for ( UserOrder o : userOrders )
            for ( Item item : o.getItems() ) {
                if (item.getType() == type)
                    System.out.println(item.getTitle());
            }
    }



    public static void displayAllTypesOfItems() {
        System.out.println("The categories of stuff for sale are: ");
        for ( Type e : Type.values() ) {
            System.out.println(e);
        }
    }

    public static void getUsersFullAddress(String username, List<User> users) {
        for ( User u : users ) {
            if (u.getUsername().equals(username)) {
                System.out.println("Full list of addresses of username " + u.getUsername() + " is: ");
                u.getAddresses().forEach((key, value) -> System.out.println(key + " " + value.getFullAddress()));
            }
        }
    }
}




