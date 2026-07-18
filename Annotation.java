class A {
    public void show() {
        System.out.println("In A's show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("In B's show");
    }
}

public class Annotation {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
