
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReferenceData {

    public static boolean isValidDate(String DateEx)
    {
        String regex = "^(((19[0-9]{2})|(2[01][0-9]{2}))-(((1[02]|0[13578])-(31))|((1[0-2]|0[1,3-9])-(29|30))|((1[0-2]|0[1-9])-(0[1-9]|1[0-9]|2[0-8]))))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)DateEx);
        return matcher.matches();
    }
    public static void main(String args[])
    {
        System.out.println(isValidDate("2000-03-31"));
    }
}
