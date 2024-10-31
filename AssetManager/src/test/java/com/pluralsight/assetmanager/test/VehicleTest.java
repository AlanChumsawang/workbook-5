package com.pluralsight.assetmanager.test;

import com.pluralsight.assetmanager.Vehicle;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @org.junit.jupiter.api.Test
    void testGetValueHonda() {
        Vehicle vehicle = new Vehicle("Vehicle", "2021-10-01", 10000, "Honda Civic", 2000, 200000);
        System.out.println(vehicle.getMakeModel().toLowerCase());
        assertEquals(9000, vehicle.getValue());
    }

    @org.junit.jupiter.api.Test
    void testGetValueNonHonda() {
        Vehicle vehicle = new Vehicle("Vehicle", "2019-09-01", 20000, "Ford Mustang", 2020, 120000);
        assertEquals(14100, vehicle.getValue());
    }
}
        /*Vehicle vehicle2 = new Vehicle("Vehicle", "2019-09-01", 2000, "Ford Mustang", 2020, 120000);
        Vehicle vehicle3 = new Vehicle("Vehicle", "2015-08-01", 3000, "Toyota Corolla", 2015, 100000);
        Vehicle vehicle4 = new Vehicle("Vehicle", "2013-07-01", 4000, "Chevy Malibu", 2013, 50000);

        assertEquals(9000, vehicle.getValue());
        assertEquals(1405, vehicle2.getValue());
        assertEquals(2760, vehicle3.getValue());
        assertEquals(2250, vehicle4.getValue());

    }
}*/
