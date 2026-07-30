
import java.util.HashSet;

public class Practice70 {
    public static int con(int[] arr) {

        int current = 0;
        int longest = 0;

        HashSet<Integer> h = new HashSet<>();
        for (int n : arr) {
            h.add(n);
        }
        for (int n : h) {
            if (!h.contains(n - 1)) {
                current = n;
                int count = 1;
                while (h.contains(current + 1)) {
                    current++;
                    count++;
                }
                if (count > longest) {
                    longest = count;
                }

            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };

        System.out.println(con(arr));
    }
}
