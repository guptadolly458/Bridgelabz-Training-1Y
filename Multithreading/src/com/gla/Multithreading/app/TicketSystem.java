package multithreading.app;

import java.util.Random;

class Ticket extends Thread {
    int ticketNo;
    String type;

    public Ticket(int no, String type) {
        this.ticketNo = no;
        this.type = type;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int time = (rand.nextInt(5) + 1) * 1000;

        long start = System.currentTimeMillis();

        System.out.println("Ticket " + ticketNo + " [" + type + "] started by "
                + getName() + " | Priority: " + getPriority());

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {}

        System.out.println("Ticket " + ticketNo + " completed");

        long end = System.currentTimeMillis();
        System.out.println("Processing Time: " + (end - start) + " ms\n");
    }
}

public class TicketSystem {
    public static void main(String[] args) {

        Ticket[] tickets = {
                new Ticket(1, "Critical Bug"),
                new Ticket(2, "Feature Request"),
                new Ticket(3, "General Query"),
                new Ticket(4, "Feedback"),
                new Ticket(5, "Critical Bug"),
                new Ticket(6, "General Query"),
                new Ticket(7, "Feature Request"),
                new Ticket(8, "Feedback"),
                new Ticket(9, "Critical Bug"),
                new Ticket(10, "General Query")
        };

        for (Ticket t : tickets) {

            if (t.type.equals("Critical Bug"))
                t.setPriority(10);
            else if (t.type.equals("Feature Request"))
                t.setPriority(4);
            else if (t.type.equals("General Query"))
                t.setPriority(2);
            else
                t.setPriority(1);

            t.start();
        }
    }
}