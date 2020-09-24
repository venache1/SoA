package exceptionTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarRentBilling {
    public static void main(String[] args) throws ArithmeticException {

        multiplication(); // a, b - integer
        System.out.println("Discount + Bonus = " + addition(-5, 50)); // a => 0
        System.out.println("Total price with discount = " + subtraction(10, 50)); // price => discount
    }

    public static void multiplication() { // a, b must be integer
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter nomber of days and price per day");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Total price =" + a * b);
        } catch (InputMismatchException e) {
            System.out.println("Wrong format. Please enter valid data");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int addition(int a, int b) throws ArithmeticException {
        if (a <= 0) throw new ArithmeticException("Please enter a valid data. Discount must be bigger than 0");
        return a + b;
    }

    public static int subtraction(int price, int discount) throws ArithmeticException {
        if (price <= 0) throw new ArithmeticException("Please enter a price bigger than 0");
        if (price <= discount) throw new ArithmeticException("Price must be bigger than discoun");
        else return price - discount;
    }
}