package firsttasks;
/*
Write a java program to compare two strings lexicographic-ally, ignoring case differences,
 if strings are different concatenate a given string to the end of another string.
 */

public class CompareStrings {
    public static void main(String[] args) {
        String string1 = "Abrandka";
        String string2 = "abrandko";
        if (!(string1.equalsIgnoreCase(string2))) {
            System.out.println(string1 + string2);
        }
    }
}