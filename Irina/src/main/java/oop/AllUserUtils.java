package oop;

import java.util.ArrayList;
import java.util.List;

public class AllUserUtils {
    public static List<AbstractUser> filterUsersByCity(List<AbstractUser> users, String city) {
        List<AbstractUser> tmpUsersByCity = new ArrayList<>();
        for ( AbstractUser user : users ) {
            if (user.isHomeCity(city)) tmpUsersByCity.add(user);
        }
        return tmpUsersByCity;
    }

    public static void printUsers(List<AbstractUser> userList) {
        for ( int i = 0; i < userList.size(); i++ ) {
            System.out.println(userList.get(i).getName());
        }
    }
}