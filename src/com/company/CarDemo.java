package com.company;

public class CarDemo {

    public static void main(String[] args) {

        Car firstCar = new Car();

        firstCar.setMake("Ford");
        firstCar.setYear(2010);
        firstCar.setModel("Fusion");
        firstCar.setColor("Silver");

        System.out.println("Here's everything we know about this car: ");
        System.out.println("Make: " + firstCar.getMake());
        System.out.println("Model: " + firstCar.getModel());
        System.out.println("Year: " + firstCar.getYear());
        System.out.println("Color: " + firstCar.getColor());

    }
}
