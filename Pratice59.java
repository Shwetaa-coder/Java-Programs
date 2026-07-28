import java.util.HashMap;
import java.util.Map;

public class Pratice59 {
    public static int p(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : arr) {
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            } else {
                m.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 5, 3, 4 };

        System.out.println(p(arr));
    }
}
