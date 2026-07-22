class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("from a");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted " + e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("From B");

        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.start();
        obj1.start();
    }
}
