package oop;

public class Car extends Vehicle implements Sound{
    int wheels = 4;
    String model;
    public Car(int given_id, String given_model) {
        super(given_id);
        this.model = given_model;
    }

    public void closeDoors() {
        System.out.println(this.id +" of model " + this.model + " is closing it's doors");
    }

    public void vroom() {
        if (!(this.motor.isBroken())) {
            System.out.println("Vroooommmmm...");
        } else {
            System.out.println("Engine broken...");
        }

    }

    public void accelerate() {
        if (this.motor.isBroken()) {
            System.out.println("Can't accelerate... It's " + this.motor.model + " motor is broken");
        } else {
            System.out.println("Car " +model + " " + id + " is Accelerating...");
        }
    }

    public void description() {
        System.out.println("This is a car");
    }
}

