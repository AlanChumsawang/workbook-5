package com.pluralsight.vehicles;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor() + " " + "Moped");

        HoverCraft hover = new HoverCraft();
        hover.setColor("blue");
        hover.setFuelCapacity(100);

        System.out.println(hover.getColor() + " " + "Hovercraft");

        Car fastCar = new Car();
        fastCar.setColor("black");
        fastCar.setFuelCapacity(50);

        System.out.println(fastCar.getColor() + " " + "Car");


    }
}
