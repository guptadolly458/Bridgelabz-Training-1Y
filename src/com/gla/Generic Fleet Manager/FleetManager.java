package com.gla.GenericFleetManager;

import java.util.ArrayList;
import java.util.List;

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T v : fleet) {
            System.out.println(v.name);
        }
    }
}
