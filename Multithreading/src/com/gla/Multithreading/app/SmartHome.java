package multithreading.app;

class Device implements Runnable {
    private String deviceName;
    private int interval;

    public Device(String name, int interval) {
        this.deviceName = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(deviceName + " running at " + System.currentTimeMillis());

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SmartHome {
    public static void main(String[] args) {

        Thread temp = new Thread(new Device("Temperature Sensor", 5000));
        Thread camera = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light Controller", 4000));
        Thread door = new Thread(new Device("Door Lock", 6000));

        camera.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        camera.start();
        light.start();
        door.start();
    }
}