package CollectionExample;

import java.util.LinkedList;
import java.util.List;

public class CollectionExercise {

    public static void main(String[] args) {

        List<String> listOfItems = new LinkedList<String>();

        listOfItems.add("Mike");
        listOfItems.add("Boc");
        listOfItems.add("Gary");

        for (String name : listOfItems) {
            System.out.println(name);
        }
    }
}
