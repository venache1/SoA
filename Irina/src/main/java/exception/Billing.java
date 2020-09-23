package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Billing {
    public static void main(String[] args) throws ArithmeticException{

        addition();
        System.out.println(subtraction(5, 1));
        System.out.println(multiplication(7, 11));
    }

    public static void addition() {
        // negative values: String, double
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a + b);
        } catch (InputMismatchException e) {
            System.out.println("Wrong format. Please enter integer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int subtraction(int price, int discount) throws ArithmeticException {
        //negative values: price or discount <=0; price<=discount

        if (price <= 0 || discount <= 0) throw new ArithmeticException("Please enter a number bigger than 0");
        if (price <= discount) throw new ArithmeticException("Discount must be smaller than price");
        else return price - discount;
    }

    public static int multiplication(int a, int b) throws ArithmeticException {
        // negative value: a or b = 0
        if (a == 0 || b == 0) throw new ArithmeticException("Please enter a valid number");
        return a * b;
    }
}