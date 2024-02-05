package String_and_Loops;

import java.sql.SQLOutput;

public class WorkingWithStrings {
    public static void main(String[] args) {
        String word = "ABCDEFGH";

        System.out.println(word.length()); // 8
        System.out.println(word.charAt(3)); // D
        System.out.println(word.compareTo("ABCDEFGH") == 0); // true
        System.out.println(word.compareToIgnoreCase("abcdefgh")==0); // true
        System.out.println(word.contains("DEF")); // true
        System.out.println(word.indexOf("B")); // Search first B occurrence from left to right
        System.out.println(word.lastIndexOf("A")); // Search first A occurrence from right to left
    }
}
