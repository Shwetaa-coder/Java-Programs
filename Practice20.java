class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Litch");
        }
    }
}

public class Practice20 {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
    }
}
