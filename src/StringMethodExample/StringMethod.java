package StringMethodExample;

public class StringMethod {

    public static void main(String[] args) {

        String text = "Hello";

        System.out.println(text.charAt(2));

        System.out.println(text.equalsIgnoreCase("el"));

        System.out.println(text.contains("el"));

        String commaSeperatedString = "This, is, a, comma, seperated, list";

        String[] stringArray = commaSeperatedString.split(",");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        System.out.println(commaSeperatedString.substring(0, 4));

        System.out.println(text.replace("l", "2"));


    }
}
