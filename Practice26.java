class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class B extends Thread {
    public void run() {

        System.out.println("hi");

    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("java");
        }
    }
}

public class Practice26 {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        C obj2 = new C();

        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj.start();
        obj1.start();
        obj2.start();
    }
}
