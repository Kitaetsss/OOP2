package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehiclesAtServiceStation = new Vehicle[]{
                new Bicycle("Bicycle1", 2),
                new Bicycle("Bicycle2", 2),
                new Car("AudiA7", 4),
                new Car("AudiA4", 4),
                new Truck("OptimusPrime",6),
                new Truck("OptimusPrime2",6),
        };
        ServiceStation station = new ServiceStation();
        for(Vehicle vehicle : vehiclesAtServiceStation){
            station.check(vehicle);
        }
    }
}