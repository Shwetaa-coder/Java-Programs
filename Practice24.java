
class A extends Thread {
    public void run() {

        System.out.println("run");

    }
}

class B extends Thread {
    public void run() {

        System.out.println("running");
    }
}

public class Practice24 {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        obj.setPriority(1);
        obj.setPriority(10);
        obj.start();
        obj1.start();
    }
}
