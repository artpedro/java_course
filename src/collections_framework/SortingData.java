package collections_framework;

import java.util.ArrayList;
import java.util.Collections;

public class SortingData {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("Cow",23));
        animals.add(new Animal("Dog",8));
        animals.add(new Animal("Cat",6));
        animals.add(new Animal("Bear",23));
        animals.add(new Animal("Armadillo",30));
        animals.add(new Animal("Turtle",50));
        animals.add(new Animal("Parrot",3));

        // To sort this list, first we have to implement Comparable interface to animal
        // Then call the sort method from Collections
        Collections.sort(animals);

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
