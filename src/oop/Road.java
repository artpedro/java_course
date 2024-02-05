package oop;

public class Road {
    public static void main(String[] args) {
        // Declaring abstract Vehicle objects and assigning Car object to it
        Vehicle vehicle1 = new Car(1234,"Fiat");
        // Giving it an engine
        vehicle1.motor = new Engine("V5",1000);
        Vehicle vehicle2 = new Motorcycle(5678,"Honda");
        vehicle2.motor = new Engine("V3",700);
        Vehicle vehicle3 = new Car(9999, "Mercedes");
        vehicle3.motor = new Engine("V7",1500);
        // Using abstract method from Vehicle
        vehicle1.accelerate();

        // Using Road class method
        isFaster(vehicle1,vehicle3);

        // Using Vehicle method
        vehicle1.hit(vehicle2);
        vehicle1.hit(vehicle3);
        vehicle1.hit(vehicle3);

        // Using Road's method that show polymorphism
        accelerateVehicle(vehicle1);
        accelerateVehicle(vehicle3);
        accelerateVehicle(vehicle2);
    }

    public static void accelerateVehicle(Vehicle auto) {
        auto.accelerate();
        auto.vroom();
    }
    public static boolean isFaster(Vehicle first, Vehicle second) {
        if (first.motor.hp > second.motor.hp) {
            System.out.println(first.id +" vehicle is faster than " + second.id +" vehicle");
            return true;
        }
        if (first.motor.hp == second.motor.hp) {
            System.out.println("They have the same speed");
            return false;
        }
        System.out.println(second.id + " vehicle is faster than "+ first.id + " vehicle");
        return false;
    }
}
