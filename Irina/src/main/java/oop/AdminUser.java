package oop;

public class AdminUser extends AbstractUser {

    public AdminUser(String name) {
        super(name);
    }

    public void approveOrder(Order order) {
        System.out.println("Order approved");
    }

    public void rejectOrder(Order order) {
        System.out.println("Order rejected");
    }
}