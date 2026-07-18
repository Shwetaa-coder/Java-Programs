interface A {

    void show();
}

public class Lambda1 {
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("in show");
        };
        obj.show();
    }
}
