interface Calculator {
    void calc();
}

class Addition implements Calculator {
    public void calc() {
        System.out.println(7 + 8);
    }
}

public class B {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.calc();
    }
}