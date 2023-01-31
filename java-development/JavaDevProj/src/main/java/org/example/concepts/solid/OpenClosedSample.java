package org.example.concepts.solid;

public class OpenClosedSample {

    static class WrongCar {
        String brand;
        WrongCar(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }
    }

    interface Car {
        String getBrand();
        int getPrice();

    }

    static class Audi implements Car {
        @Override
        public String getBrand() {
            return "Audi";
        }

        @Override
        public int getPrice() {
            return 10000;
        }
    }
    static class Mazda implements Car {
        @Override
        public String getBrand() {
            return "Mazda";
        }

        @Override
        public int getPrice() {
            return 12000;
        }

    }

    public static void main(String[] args) {
        WrongCar wrongCar = new WrongCar("Audi");
        WrongCar wrongCar2 = new WrongCar("Mazda");
        WrongCar[] wrongCars = new WrongCar[] {wrongCar, wrongCar2};
        printAllWrongCarsPrice(wrongCars);

        Car[] cars = new Car[]{new Audi(), new Mazda()};
        printAllCarsPrice(cars);
    }

    // If we add a new car, we will need to modify this entire method.
    static void printAllWrongCarsPrice(WrongCar[] wrongCars) {
        for (WrongCar wc: wrongCars) {
            if ("Audi".equals(wc.brand)) System.out.println("Price for " + wc.getBrand() + " is " + 10000);
            if ("Mazda".equals(wc.brand)) System.out.println("Price for " + wc.getBrand() + " is " + 12000);
        }
    }

    // If we add a new car, no changes are required.
    static void printAllCarsPrice(Car[] cars) {
        for (Car car: cars) {
            System.out.println("Price for " + car.getBrand() + " is " + car.getPrice());
        }

    }
}
