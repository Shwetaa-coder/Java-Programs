public class Practice65 {

    public static int maxSubArray(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        // Starting point of subarray
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            // Ending point of subarray
            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                // Update maximum sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(maxSubArray(arr));
    }
}