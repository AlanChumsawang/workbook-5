package com.pluralsight.vehicles;

public class Vehicles {
    String color;
    int numberOfPasengers;
    int cargoCapacity;
    int fuelCapacity;


    public String getColor() {
        return color;
    }

    public int getNumberOfPasengers() {
        return numberOfPasengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfPasengers(int numberOfPasengers) {
        this.numberOfPasengers = numberOfPasengers;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
