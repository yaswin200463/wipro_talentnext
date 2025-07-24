package interfacenew;

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {
    // Overriding the conflicting method
    @Override
    public void message() {
        // Resolving conflict by explicitly specifying interface name
        Vehicle.super.message(); // You can also call FourWheeler.super.message() if needed
        System.out.println("Inside Car");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.message(); // Call the overridden method
    }
}

