class DEMO {
    private int a = 10; // PRIVATE VARIABLE CANNOT BE ACCESSED OUTSIDE THE CLASS
    int b = 20; // DEFAULT VARIABLE CAN BE ACCESSED OUTSIDE THE CLASS IN THE SAME PACKAGE
    protected int c = 30; // accessible everywhere + subclasses
    public int d = 40; // accessible everywhere

    void show() {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        DEMO obj = new DEMO();
        obj.show();
        // System.out.println(obj.a); //private variable cannot be accessed outside the
        // class
        System.out.println(obj.b); // default variable can be accessed outside the class in the same package
        System.out.println(obj.c); // protected variable can be accessed outside the class in the same
        System.out.println(obj.d); // public variable can be accessed outside the class in the same package

    }

}
