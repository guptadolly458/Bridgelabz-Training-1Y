package multithreading.app;

class BankAccount implements Runnable {
    private String accountHolder;
    private String accountType;

    public BankAccount(String name, String type) {
        this.accountHolder = name;
        this.accountType = type;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " (" + accountType + ") checking balance | Priority: "
                    + Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        Thread premium = new Thread(new BankAccount("Aman", "Premium"));
        Thread regular = new Thread(new BankAccount("Riya", "Regular"));
        Thread basic = new Thread(new BankAccount("Rahul", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.setName("Premium-User");
        regular.setName("Regular-User");
        basic.setName("Basic-User");

        premium.start();
        regular.start();
        basic.start();
    }
}