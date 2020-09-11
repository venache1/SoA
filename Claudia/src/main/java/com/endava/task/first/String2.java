package com.endava.task.first;

public class String2 {
    public static void main(String[] args) {
        String text = "John is from Manhatan ";
        String text1 = " Jhon is from manhatan";

        if (text.equalsIgnoreCase(text1))
            System.out.println("The strings are equal ");
        else
            System.out.println("The strings are not equal. The concatenated string: " + text + text1);
    }
}
