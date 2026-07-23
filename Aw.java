interface Calc {
    void calc();
}

public class Aw {

    public static void main(String[] args) {
        Calc c = new Calc() {
            public void calc() {
                System.out.println("sum " + (2 + 5));
            }
        };
        Calc s = new Calc() {
            public void calc() {
                System.out.println("product " + (2 * 5));
            }
        };
        c.calc();
        s.calc();
    }
}
