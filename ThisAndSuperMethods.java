class A {
    int x;

    A(int x) {
        this.x = x;
    }

    void show() {
        System.out.println(x);
    }
}

public class ThisAndSuperMethods {
    public static void main(String[] args) {
        A a = new A(10);
        a.show();
    }
}
