package ru.skypro;

public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            System.out.println("Проверяем и ремонтируем " + bicycle.getModelName());
            bicycle.updateTyre();
        }
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("Проверяем и ремонтируем " + car.getModelName());
            car.updateTyre();
            car.checkEngine();
        }
        if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("Проверяем и ремонтируем " + truck.getModelName());
            truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
}