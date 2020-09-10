package firsttasks;
/*
Write a method which get as input a string and validate if it is a date formatted as "yyyy-MM-dd" using regex.
 */

public class ValidateDateIfRegex {
    public static void main(String[] args) {
        String valueToCheck = "2020-09-07";
        if (valueToCheck.matches("(^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$)")) {
            System.out.println("It is a date in \"yyyy-MM-dd\" format");
        } else
            System.out.println("It's not a date");
    }
}