package GenericAndCollectionExample;

import java.util.ArrayList;

public class GenericExample {

    public static void main(String[] args) {
        ArrayList<Object> objectList = new ArrayList<Object>();

        Double doubleNumber = 1.5;
        String name = "Gary";
        Integer integerNumber = 5;
        Character letter = 'a';

        objectList.add(doubleNumber);
        objectList.add(name);
        objectList.add(integerNumber);
        objectList.add(letter);

        for( Object item : objectList) {
            GenericExample.displayName(item);
        }
    }

    static <T> void displayName(T variable) {
        System.out.println(variable.getClass().getName());
    }
}
