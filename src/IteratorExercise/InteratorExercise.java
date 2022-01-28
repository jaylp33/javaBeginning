package IteratorExercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteratorExercise {

    public static void main(String[] args) {
        List<String> StringList = new LinkedList<String>();

        StringList.add("Bob");
        StringList.add("Derryn");
        StringList.add("Gary");

        Iterator<String> iterator = StringList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
