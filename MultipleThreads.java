class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("from class Hi");
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("from class Hello");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.setPriority(1);
        obj2.setPriority(10);

        obj1.start();
        obj2.start();
    }
}
