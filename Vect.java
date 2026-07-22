import java.util.Vector;

public class Vect {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        System.out.println(v);
        v.remove("B");
        System.out.println(v);
    }
}
