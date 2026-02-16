class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
