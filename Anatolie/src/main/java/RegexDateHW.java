public class RegexDateHW {
    public static void main(String[] args) {
        validateDate("0991-12-31");
    }

    public static void validateDate(String date) {
        if (date.matches("^(([1-2]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])))$")) {
            System.out.println("Date format is correct");
        } else {
            System.out.println("Wrong date format");
        }
    }
}
