import java.util.HashMap;
import java.util.Map;

public class BillingClass {
    public static void main(String[] args) {

        double balance = 0;
        String[] numbers = {"one", "two", "three", "four", "five"};
        try {
            printAllStringNumbers(numbers);
        } catch (IndexOutOfBoundsException numbersException) {
            System.out.println("There aren't enough numbers in your string");
        }
        addSomeNumbers(120);


        HashMap<String, Integer> shoppingMall = new HashMap<>();
        shoppingMall.put("Shoes", 40);
        shoppingMall.put("TShirt", 20);
        shoppingMall.put("Socks", 6);
        shoppingMall.put("Sneakers", 115);
        shoppingMall.put("Shirt", 45);
        shoppingMall.put("Hat", 12);
        shoppingMall.put("Glasses", 80);
        shoppingMall.put("Bracelet", 15);
        shoppingMall.put("Watch", 55);
        shoppingMall.put("Suit", 120);
        shoppingMall.put("Jeans", 70);
        shoppingMall.put("Phone", 300);
        shoppingMall.put("Headphones", 70);
        shoppingMall.put("Backpack", 55);
        goShopping(balance, shoppingMall);

        payInterest(balance);
    }

    private static void printAllStringNumbers(String[] numbers) {
        for ( int i = 0; i <= 10; i++ ) {
            System.out.println(numbers[i]);
        }
    }

    private static void addSomeNumbers(int limit) {
        System.out.println("Adding numbers till: " + limit);
        int sum = 0;
        try {
            for ( int i = 0; i <= limit; i++ ) {
                if (sum > limit) {
                    throw new Exception();
                }
                    sum += i;

            }
        } catch (Exception TooMuch) {

            System.out.println("Catch: You have added to much");

        } finally {
            System.out.println(sum);
        }
    }

    private static void goShopping(double balance, Map shoppingMall) {
        System.out.println("Let's go shopping");
        try {
            for ( Object key : shoppingMall.keySet() ) {
                if (balance <= 0) {
                    throw new Throwable();
                } else {
                    Integer item = (Integer) shoppingMall.get(key);
                    balance = balance - item;
                    System.out.println(key + " Price: " + shoppingMall.get(key));
                }
            }

        } catch (Throwable StopShoppingException) {
            System.out.println("Warning: You're out of money ! ! !");
        } finally {
            System.out.println("You have " + balance + "$ on your account.");
        }
    }

    private static void payInterest(double balance) {
        try {
            if (balance > 0) {
                double interest = balance * 0.045;
                balance += interest;
                System.out.println("Your interest is: " + interest + "$");
            } else {
                throw new Throwable();
            }
        } catch (Throwable NegativeAmount) {

            System.out.println("You don't have enough money");
        } finally {
            System.out.println("Your balance is: " + balance + "$");
        }
    }
}
