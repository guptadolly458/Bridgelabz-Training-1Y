package com.gla.logistics;
public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");
        Checkpoint c1 = new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70);
        Checkpoint c2 = new FuelCheckpoint("C2", "Pump 12", 20, 30, 30);

        d.routeHistory.addCheckpoint(c1);
        d.routeHistory.addCheckpoint(c2);

        DriverDAO.insertDriver(d);

        CheckpointDAO.insertCheckpoint(c1, d.driverId);
        CheckpointDAO.insertCheckpoint(c2, d.driverId);

        d.printSummary();
    }
}