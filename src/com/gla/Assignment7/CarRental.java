class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateCost() {
        return rentalDays * 1000; // per day cost
    }

    void display() {
        System.out.println(customerName + " | " + carModel + " | Cost: " + calculateCost());
    }
}
