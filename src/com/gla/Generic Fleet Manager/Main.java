package com.gla.GenericFleetManager;

class Main {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Truck A"));

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Bike X"));

        truckFleet.showFleet();
        bikeFleet.showFleet();
    }
}
