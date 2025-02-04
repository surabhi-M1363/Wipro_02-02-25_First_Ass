
class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key ignition.");
    }
}
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a self-start button.");
    }
}

public class VehicleTest {
    static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorcycle();

        vehicleTestDrive(myCar);
        vehicleTestDrive(myBike);
    }
}
