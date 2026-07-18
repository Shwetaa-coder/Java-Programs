interface A {

    void show(int i, int j);
}

public class Lambda3 {
    public static void main(String[] args) {
        A obj = (i, j) -> System.out.println("in show " + i + "," + j);
        obj.show(8, 7);
    }
}
