class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("java");
        }
    }
}

public class Practice25 {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        C obj2 = new C();
        obj.start();
        obj1.start();
        obj2.start();
    }
}
