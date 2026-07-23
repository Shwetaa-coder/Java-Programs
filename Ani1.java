class Person {
    void show() {
        System.out.println("from person");
    }
}

public class Ani1 {
    public static void main(String[] args) {
        Person p = new Person() {

            void show() {
                System.out.println("from anonymous");
            }
        };
        p.show();
    }
}
