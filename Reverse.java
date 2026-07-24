import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int t = a[left];
            a[left] = a[right];
            a[right] = t;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}
