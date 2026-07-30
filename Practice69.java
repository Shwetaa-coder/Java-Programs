import java.util.ArrayList;
import java.util.Collections;

public class Practice69 {
    public static void leaders(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];

        ArrayList<Integer> a = new ArrayList<>();
        a.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                a.add(arr[i]);
            }
        }
        Collections.reverse(a);
        System.out.println(a);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 22, 12, 3, 0, 6 };

        leaders(arr);
    }
}
