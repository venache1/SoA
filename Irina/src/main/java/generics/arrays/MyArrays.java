package generics.arrays;

/*
Consider an integer array and a string array. Write a single method `printArray` that can print all elements of both arrays.
The method should be able to accept both integer arrays or string arrays.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyArrays {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] intArray = new Integer[3];
        String[] stringArray = new String[3];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < intArray.length; i++) {
            stringArray[i] = reader.readLine();
        }

        Printing.printArray(intArray);
        Printing.printArray(stringArray);
    }
}