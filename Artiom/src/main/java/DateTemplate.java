public class DateTemplate {
    public static void main(String[] args) {
        String dateRegex = "2020-09-09";
        if (dateRegex.matches("^([1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))$"))
            System.out.println("String is date in format yyyy-MM-dd");
        else System.out.println("String is not date in format yyyy-MM-dd");
    }
}
