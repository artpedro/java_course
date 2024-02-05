package oop;

public class Motorcycle extends Vehicle implements Sound{
    int wheels = 2;
    String model;
    public Motorcycle(int given_id, String model) {
        super(given_id);
        this.model = model;
    }

    public void vroom() {
        if (!(this.motor.isBroken())) {
            System.out.println("Vrr-Vrr-Vrommm...");
        } else {
            System.out.println("Engine broken...");
        }
    }

    public void accelerate() {
        if (this.motor.isBroken()) {
            System.out.println("Can't accelerate... It's " + this.motor.model + " motor is broken");
        } else {
            System.out.println("Motorcycle "+ model + " " + id + " is Accelerating...");
        }
    }

    public void description() {
        System.out.println("This is a motorcycle");
    }
}
