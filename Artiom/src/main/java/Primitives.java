//3. Write a java program to compare two strings lexicographically, ignoring case differences, if strings are different concatenate a given string to the end of another string.
public class Primitives {
    public static void main(String[] args) {
        String lowerString = "spring";
        String upperString = "Spring";
        if (lowerString.equals(upperString))
            System.out.println("Strings are not different");
        else
            System.out.println(lowerString + upperString);
    }
}


