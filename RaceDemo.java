
class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class RaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable o1 = () -> {
            for (int i = 1; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable o2 = () -> {
            for (int i = 1; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
