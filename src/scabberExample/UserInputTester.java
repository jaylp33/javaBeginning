package scabberExample;

import java.util.Scanner;

public class UserInputTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a String");
            String userInput = scanner.nextLine();
            System.out.println("User Input: " + userInput);

        } catch (Exception exception) {
            System.out.println(exception);
            exception.getLocalizedMessage();
        } finally {
            scanner.close();
        }
    }
}
