class A extends Thread {
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }
}

public class Practice22 {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
    }
}