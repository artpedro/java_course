package oop;

public class Vehicle {
    int id;
    int wheels;
    Engine motor;
    int hits = 0;
    public Vehicle(int given_id) {
        this.id = given_id;
    }
    public void accelerate() {
        if (this.motor.isBroken()) {
            System.out.println("Can't accelerate... It's " + this.motor.model + " motor is broken");
        } else {
            System.out.println("Vehicle " + id + " is Accelerating...");
        }
    }
    public void hit(Vehicle second) {
        System.out.println("Ouch! " + this.id + " vehicle hit " + second.id + " vehicle");
        this.hits = this.hits + 1;
        second.hits = second.hits + 1;
        if (this.hits >= 3) {
            this.motor.broke();
        }
    }
}
