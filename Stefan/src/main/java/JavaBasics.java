public class JavaBasics {
    public static void main(String[] args) {
        printMonthByNumber(6);
        printMonthByNumber(12);
        printMonthByNumber(44);
        compareStrings("blue", "Blmue");
        calculateCircleArea(5.3);
        displayNumbers(10, 15);
    }

    static void printMonthByNumber(int month) {
        switch (month) {
            case 1:
                System.out.println("The 1st month of the year is January");
                break;
            case 2:
                System.out.println("The 2nd month of the year is February");
                break;
            case 3:
                System.out.println("The 3rd month of the year is March");
                break;
            case 4:
                System.out.println("The 4th month of the year is April");
                break;
            case 5:
                System.out.println("The 5th month of the year is May");
                break;
            case 6:
                System.out.println("The 6th month of the year is June");
                break;
            case 7:
                System.out.println("The 7th month of the year is July");
                break;
            case 8:
                System.out.println("The 8th month of the year is August");
                break;
            case 9:
                System.out.println("The 9th month of the year is September");
                break;
            case 10:
                System.out.println("The 10th month of the year is October");
                break;
            case 11:
                System.out.println("The 11th month of the year is November");
                break;
            case 12:
                System.out.println("The 12th month of the year is December");
                break;
            default:
                System.out.println("The month " + month + " does not exist");
        }
    }

    static void displayNumbers(int lowerLimit, int upperLimit) {
        System.out.println("The numbers from " + lowerLimit + " to " + upperLimit + " are:");
        for ( int j = lowerLimit; j <= upperLimit; j++ ) {
            System.out.println(j);
        }
    }

    static void calculateCircleArea(double ray) {
        System.out.println("Circle area is " + ray * ray * Math.PI);
    }

    static void compareStrings(String firstString, String seccondString) {
        if (!firstString.equalsIgnoreCase(seccondString)) {
            System.out.println("The strings are NOT equal: " + firstString.concat(seccondString));
        } else {
            System.out.println("The stings are equal");
        }
    }
}
