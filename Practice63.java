import java.util.Arrays;

public class Practice63 {
    public static void sortarray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 0, 1, 0 };
        sortarray(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
