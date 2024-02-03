package basics;

import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        // Declaring a variable of type int array, with 100 slots
        int[] values;
        values = new int[100];
        // only stores int
        // fixed size

        // Choosing the third slot and assigning the value 1000 to it
        values[2] = 1000;

        System.out.println(values[3]); // return 0
        System.out.println(values[99]);  // last elem

        // Declaring a filled array
        String[] words = new String[] {"My","name","is"};

    }
}
