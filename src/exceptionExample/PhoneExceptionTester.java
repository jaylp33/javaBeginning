package exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[] args) {
        String[] numbers = { "123-232", null, "213-1234", "2312313-22"};

        for(int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(new Phone("iphone", numbers[i]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }

    }
}
