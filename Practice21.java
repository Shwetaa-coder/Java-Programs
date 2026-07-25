class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + " is " + (i * i));
        }
    }
}

public class Practice21 {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
    }
}
