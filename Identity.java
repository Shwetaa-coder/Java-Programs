import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identity {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");

        HashMap<String, Integer> h = new HashMap<>();

        IdentityHashMap<String, Integer> i = new IdentityHashMap<>();
        h.put(s1, 1);
        h.put(s2, 2);

        i.put(s1, 1);
        i.put(s2, 2);

        System.out.println("Hashmap " + h);

        System.out.println("Identity Hashmap " + i);
    }
}
