public class ReferenceDataTypes {
    public static void main(String[] args) {
       validateDate("2020-12-20");
    }
    private static void validateDate(String date) {
        if (date.matches("^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))$")){
            System.out.println("Date format is correct: " + date);
        } else {
            System.out.println("Date format is incorrect: " + date);
        }
    }
}
