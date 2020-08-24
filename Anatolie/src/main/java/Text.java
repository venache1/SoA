public class Text {
        public static void main(String[] args) {
            String lowerString = "HeLLo1";
            String upperString = "heLLO";
            if (!lowerString.equalsIgnoreCase(upperString)) {
                System.out.println(lowerString + upperString);
            }
            else {
                System.out.println("Strings are equal");
            }
        }
    }