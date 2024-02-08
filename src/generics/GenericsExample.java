package generics;

import java.util.HashSet;

public class GenericsExample {
    public static void main(String[] args) {

        // This notation let you define the type of the elements passed in
        Container<String,Integer> c1 = new Container<>("First",1);
        Container<String,String> c2 = new Container<>("Second","String");

        HashSet<String> words = new HashSet<>();
        words.add("Abc");
        words.add("Def");
        words.add("Abc");
        words.add("Ghi");

        HashSet<String> words2 = new HashSet<>();
        words2.add("Jkl");
        words2.add("Mno");
        words2.add("Pqr");

        HashSet<String> newSet = unionSet(words, words2);
        System.out.println(newSet);
    }

    // This is a generics method, executing the function according to the parameter type
    public static <E> HashSet<E> unionSet(HashSet<E> set1, HashSet<E> set2) {
        set1.addAll(set2);
        return set1;
    }
}
