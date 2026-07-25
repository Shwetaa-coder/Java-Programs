class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + "=" + (5 * i));
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("10 * " + i + "=" + (10 * i));
        }
    }
}

public class Practice23 {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        obj1.start();
    }
}
