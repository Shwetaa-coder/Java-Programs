class A extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class Practice19 {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
    }
}