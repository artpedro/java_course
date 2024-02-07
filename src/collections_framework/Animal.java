package collections_framework;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    String name;
    int age;

    // All methods created using alt + insert
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    // Using this method, we can evaluate if two objects have the same attributes using equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() && Objects.equals(getName(), animal.getName());
    }

    // Using this method, we can give two objects with same attributes the same hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Pass the instructions to how compare this object to other

    public int compareTo(Animal o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }

}