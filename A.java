class Bird {
    void fly() {
        System.out.println("not flying");
    }
}

public class A {
    public static void main(String[] args) {
        Bird b = new Bird() {
            void fly() {
                System.out.println("flying");
            }
        };
        b.fly();
    }
}
