package oop;

public abstract class Vehicle implements Sound{
    int id;
    int wheels;
    Engine motor;
    int hits = 0;
    public Vehicle(int given_id) {
        this.id = given_id;
    }
    public void hit(Vehicle second) {
        System.out.println("Ouch! " + this.id + " vehicle hit " + second.id + " vehicle");
        this.hits = this.hits + 1;
        second.hits = second.hits + 1;
        if (this.hits >= 3) {
            this.motor.broke();
        }
    }
    public abstract void description();
    public abstract void vroom();
    public abstract void accelerate();
}
