
import java.util.HashMap;
import java.util.Map;

public class Practice50 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 5, 5, 6, 6, 7 };
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : arr) {
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            } else {
                m.put(n, 1);
            }
        }
        int maxf = Integer.MIN_VALUE;
        int minf = Integer.MAX_VALUE;

        int min = -1;
        int max = -1;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            int element = e.getKey();
            int frequency = e.getValue();

            if (frequency > maxf) {
                maxf = frequency;
                max = element;
            }
            if (frequency < minf) {
                minf = frequency;
                min = element;
            }

        }
        System.out.println("Highest Frequency Element : " + max);
        System.out.println("Highest Frequency         : " + maxf);

        System.out.println();

        System.out.println("Lowest Frequency Element  : " + min);
        System.out.println("Lowest Frequency          : " + minf);

    }
}
