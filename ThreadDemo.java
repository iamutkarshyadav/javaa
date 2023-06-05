//Question 20
class Queue {
    int item = 0; // shared between producer and consumer
    boolean busy = false; // use of flag

    synchronized int get()// invoked by consumer
    {
        if (!busy)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Get:InteerruptedException");
            }
        System.out.println("Get:" + item);
        busy = false;
        notify();
        return item;
    }

    synchronized void put(int item) {
        if (busy)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Put:InteerruptedException");
            }
        this.item = item;
        busy = true;
        System.out.println("Put:" + item);
        notify();
    }
}

class Producer implements Runnable {
    int i;
    Queue q;

    Producer(Queue q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        {
            try {
                while (i <= 10)
                    q.put(i++);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    Queue q;

    Consumer(Queue q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            try {
                while (i <= 10)
                    q.get();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Queue q = new Queue();
        new Producer(q);
        new Consumer(q);
    }
}
