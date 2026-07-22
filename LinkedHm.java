import java.util.LinkedHashMap;

public class LinkedHm {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
        m.put(1, "a");
        m.put(2, "b");
        m.put(3, "c");
        System.out.println(m);
    }
}
