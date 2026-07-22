class A implements Runnable {
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

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("from b");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted " + e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable o1 = new A();
        Runnable o2 = new B();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t1.start();
        t2.start();
    }
}
