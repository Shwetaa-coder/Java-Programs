interface A {
    int age = 24;
    int area = 44;

    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class Interface {
    public static void main(String a[]) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.area);
    }
}
