package generics;

public class FirstGenericsTask {
    private static <E> void printArray(E[] inputArray) {
        for ( E element : inputArray ) {
            System.out.printf("%s", element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 22, 33, 44};
        String[] strArray = {"one", "two", "three", "four", "five", "six", "seven"};

        System.out.println("intArray contains: ");
        printArray(intArray);

        System.out.println("strArray contains:");
        printArray(strArray);
    }
}
