public class Practice66 {
    public static int max(int[] arr) {
        int profit = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                profit = arr[j] - arr[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 1, 5, 3, 6, 4 };

        System.out.println(max(arr));
    }
}
