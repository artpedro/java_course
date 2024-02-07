package collections_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataStructures {
    public static void main(String[] args) {
        // ArrayList is a useful class to store multiple objects dynamically
        // This data structure basically creates and transfer arrays dynamically during it's usage
        // Pros: Data retrieval is fast;  Cons: Data structure manipulation is slower;
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("aaa");
        words.add("there");
        words.add("this is a ArrayList");
        words.remove(1);

        // System.out.println(words.get(1));

        // ArrayList can be iterated using this notation
        for (String word : words) {
            System.out.println(word);
        }

        // This LinkedList class works similar to the ArrayList, but it's implemented in a different way
        // Adding and removing elements does not require copying or changing all the elements in the list
        // It uses a node object to each element pointing to the next node in a double linked list structure
        // Pros: Data structure manipulation is fast;  Cons: Data retrieval is slower;
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(23);
        numbers.add(145);
        numbers.add(123214);
        numbers.addFirst(2);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
