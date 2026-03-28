interface Vehicle {
    void displaySpeed();

    default void showBattery() {
        System.out.println("Battery: 80%");
    }
}