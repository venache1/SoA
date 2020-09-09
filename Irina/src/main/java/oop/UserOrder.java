package oop;

public class UserOrder extends OrderByAnyUser {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}