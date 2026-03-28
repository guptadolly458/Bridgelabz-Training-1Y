package multithreading.app;

class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int id, String restaurant, int time) {
        this.orderId = id;
        this.restaurant = restaurant;
        this.deliveryTime = time;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        System.out.println("Order " + orderId + " picked up by " +
                Thread.currentThread().getName());

        try {
            Thread.sleep(deliveryTime * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order " + orderId + " in transit...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        System.out.println("Order " + orderId + " delivered by " +
                Thread.currentThread().getName());

        long end = System.currentTimeMillis();
        System.out.println("Total Delivery Time: " + (end - start) + " ms\n");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        Thread o1 = new Thread(new Order(1, "Pizza Hut", 2), "Agent-1");
        Thread o2 = new Thread(new Order(2, "KFC", 3), "Agent-2");
        Thread o3 = new Thread(new Order(3, "Dominos", 1), "Agent-3");
        Thread o4 = new Thread(new Order(4, "Burger King", 4), "Agent-4");
        Thread o5 = new Thread(new Order(5, "Subway", 2), "Agent-5");

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(5);
        o5.setPriority(3);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}