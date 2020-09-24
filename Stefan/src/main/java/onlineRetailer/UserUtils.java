package onlineRetailer;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {
    public static List<User> createListOfUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("samurai", new Address("Chisinau", "Moldova", "Lazo"), 1));
        users.add(new User("Jora", new Address("Kinshasa", "Kenya", "Black Rd"), 2));
        users.add(new User("Man", new Address("The City", "The country", "The Street"), 3));
        users.add(new User("Jiro", new Address("Japan", "Tokyo", "Shibuya"), 4));
        users.add(new User("Toreto", new Address("Moldova", "Cahul", "Eminescu"), 5));
        users.add(new User("Thor", new Address("Norway", "Oslo", "Odin Street"), 6));
        users.add(new User("Guguta", new Address("Moldova", "Chisinau", "Ion Creanga"), 7));
        users.add(new User("Che", new Address("Cuba","Havana", "Cuba Libre"), 8));
        return users;
    }
}
