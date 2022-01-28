package regExExample;

import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String[] args) {
        String userEmail = "jeff@gmail.com";
        String regExRule = "^(.+)@(.+).(.+)$";

        Pattern pattern = Pattern.compile(regExRule);
        System.out.println(pattern.matcher(userEmail).matches()+"\n");
        System.out.println(pattern.matcher(userEmail));
    }
}
