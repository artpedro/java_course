package oop;

public class Engine {
    // Engine's horsepower
    int hp;
    // Engine's model
    String model;
    // Engine's state
    boolean broken = false;

    public Engine(String given_model, int given_hp) {
        this.model = given_model;
        this.hp = given_hp;
    }
    // Engine breaks
    public void broke() {
        System.out.println("Oh no! The " + this.model + " engine stopped working!");
        this.broken = true;
    }

    // Check engine's state;
    public boolean isBroken() {
        return this.broken;
    }
}
