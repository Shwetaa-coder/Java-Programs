import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int left = 0;
        int right = arr.length - 1;
        int t = 0;
        while (left < right) {
            t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
