public class Practice57 {
    public static int missing(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum = arraySum + arr[i];
        }
        return sum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int n = 5;
        System.out.println(missing(arr, n));
    }
}
