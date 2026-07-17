final public class Final { // final class cannot be inherited

    final int num = 10; // final variable cannot be changed

    final void display() {
        // final method cannot be overridden
        System.out.println("Final number :" + num);

    }

    public static void main(String args[]) {
        Final obj = new Final();
        obj.display();
        // obj.num=20 will throw ERROR as it cannot assign a value to final variable
    }
}
