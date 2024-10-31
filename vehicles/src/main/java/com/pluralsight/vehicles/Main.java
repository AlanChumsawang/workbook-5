package com.pluralsight.vehicles;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();// Create a new Moped object
        slowRide.setColor("red");//Access vehicle properties because Moped extends Vehicles
        slowRide.setFuelCapacity(5);//Access vehicle properties because Moped extends Vehicles

        System.out.println(slowRide.getColor() + " " + "Moped"); // Print out the color and type of vehicle

        HoverCraft hover = new HoverCraft();// Create a new HoverCraft object
        hover.setColor("blue");//Access vehicle properties because HoverCraft extends Vehicles
        hover.setFuelCapacity(100);//Access vehicle properties because HoverCraft extends Vehicles

        System.out.println(hover.getColor() + " " + "Hovercraft");// Print out the color and type of vehicle

        Car fastCar = new Car();// Create a new Car object
        fastCar.setColor("black");//Access vehicle properties because Car extends Vehicles
        fastCar.setFuelCapacity(50);//Access vehicle properties because Car extends Vehicles

        System.out.println(fastCar.getColor() + " " + "Car");


    }
}
