package Day_8;

abstract class Vehicle {
    abstract void engine();
}

class Car extends Vehicle {

    @Override
    void engine() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {

    @Override
    void engine() {
        System.out.println("Truck has bad engine");
    }
}

public class Vehicle_Management {
    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle = new Car();
        vehicle.engine();
        vehicle = new Truck();
        vehicle.engine();
    }
}