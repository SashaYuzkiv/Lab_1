package main;

import car.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Toyota", 2010, 10000.0, "AA2859CB"),
                new Car(2, "Honda", 2015, 12000.0, "BK2126KE"),
                new Car(3, "Mazda", 2012, 11000.0, "BO9956CA"),
                new Car(4, "Ford", 2018, 15000.0, "AB7557AA"),
                new Car(5, "Nissan", 2011, 8000.0, "CA2233AC")
        };

        printCarsByModel(cars, "Toyota");
        System.out.println();
        printCarsByModelAndYears(cars, "Honda", 5);
        System.out.println();
        printCarsByYearAndPrice(cars, 2012, 10000.0);
    }

    public static void printCarsByModel(Car[] cars, String model) {
        System.out.println("Автомобілі певної моделі " + model + ":");
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                System.out.println(car.toString());
            }
        }
    }

    public static void printCarsByModelAndYears(Car[] cars, String model, int years) {
        System.out.println("Автомобілі певної моделі " + model + " який має більше " + years + " років:");
        int currentYear = 2023;
        for (Car car : cars) {
            if (car.getModel().equals(model) && (currentYear - car.getYear()) > years) {
                System.out.println(car.toString());
            }
        }
    }

    public static void printCarsByYearAndPrice(Car[] cars, int year, double price) {
        System.out.println("Автомобілі з роком виробництва " + year + " і ціною більшою за " + price + ":");
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                System.out.println(car.toString());
            }
        }
    }
}