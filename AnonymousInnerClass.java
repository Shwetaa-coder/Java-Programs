class A {
    public void show() {
        System.out.println("A method");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in new anonymous  show method");
            }
        };
        obj.show();
    }
}
