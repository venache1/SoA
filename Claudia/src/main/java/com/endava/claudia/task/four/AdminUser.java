package com.endava.claudia.task.four;

public class AdminUser extends AbstractUser {

    public AdminUser(String username, String addressType, Address address) {
        super (username, addressType, address);
    }

    public void approveOrder(Order order) {
        System.out.printf("%s approved the order with id %d\n", getUsername(), order.getId());
    }

    public void rejectOrder(Order order) {
        System.out.printf("%s rejected the order with id %d\n", getUsername(), order.getId());
    }

}