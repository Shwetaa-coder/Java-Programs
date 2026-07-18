abstract class A {
    public abstract void show();
}

public class AbstractClassAndAnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.err.println("in new show ");
            }
        };
        obj.show();
    }

}
