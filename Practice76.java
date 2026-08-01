public class Practice76 {

    public static int low(int[] arr, int t) {
        int l = 0;
        int h = arr.length - 1;
        int ans = arr.length;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] > t) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 4, 4, 6, 8 };
        int x = 5;

        System.out.println(low(arr, x));
    }

}
