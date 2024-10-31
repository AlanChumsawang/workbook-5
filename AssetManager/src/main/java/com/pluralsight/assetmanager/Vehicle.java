package com.pluralsight.assetmanager;

public class Vehicle extends Asset {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = originalCost;
        if (year >= 2021) {
            value = originalCost - (0.03 * originalCost);
        } else if (year >= 2018) {
            value = originalCost - (0.06 * originalCost);
        } else if (year >= 2014) {
            value = originalCost - (0.08 * originalCost);
        } else if (year < 2014) {
            value = originalCost - (1000);
        }

        if (!makeModel.toLowerCase().contains("toyota") && !makeModel.contains("honda") && odometer > 100000) {
            value = value - (0.25 * originalCost);
        }
        return value;
    }
}

