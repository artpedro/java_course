package collections_framework;

import java.util.HashMap;

public class HashMapsExample {
    public static void main(String[] args) {
        // Defining a map with String as Keys and Values
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("April","Forth month of the year");
        map.put("May","Fifth month of the year");
        map.put("February","Second month of the year");
        map.put("December","Last month of the year");
        map.put("November","Second last month of the year");

        // HashMap don't maintain any other
        // but TreeMap maintain the natural other (using compareTo)
        // and LinkedHashMap maintain the other of insertion

        for (String month : map.keySet()) {
            System.out.println(month);
            System.out.println(map.get(month));
        }

    }
}
