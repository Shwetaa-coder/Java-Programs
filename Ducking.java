class A {
    public void show() throws ClassNotFoundException {
        System.out.println("in show");
        Class.forName("Calculator");
    }
}

public class Ducking {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found : " + e);
            e.printStackTrace();
        }
    }
}
