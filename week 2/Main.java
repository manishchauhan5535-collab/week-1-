class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or button");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start button");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();
    }
}