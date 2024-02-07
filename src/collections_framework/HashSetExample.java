package collections_framework;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<Animal>();

        animals.add(new Animal("Cow",12));
        animals.add(new Animal("Dog",7));
        animals.add(new Animal("Rabbit",23));
        animals.add(new Animal("Cow",12));

        // The second cow is ignored, because a set does not store elements with the same hashcode
        for (Animal animal : animals) {
            System.out.println(animal);
        }






    }
}
