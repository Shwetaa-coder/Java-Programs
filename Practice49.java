import java.util.HashMap;
import java.util.Map;

class Practice49 {
    public static void main(String a[]) {
        int[] num = { 1, 1, 3, 5, 7, 7 };
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int n : num) {
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            } else {
                m.put(n, 1);
            }
        }
        System.out.println("Element : Frequency");
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + "    :     " + e.getValue());
        }

    }
}