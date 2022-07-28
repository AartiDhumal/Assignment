/**
 1. Write a program in which you will declare an abstract class Vehicle inherits this class from
 two classes car and truck using the method engine in both display "car has good engine" and "truck has
 bad engine".
 */

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

public class Question1_Vehicle_Management {
    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle = new Car();
        vehicle.engine();
        vehicle = new Truck();
        vehicle.engine();
    }
}

/*
Output

Car has good engine
Truck has bad engine

 */


