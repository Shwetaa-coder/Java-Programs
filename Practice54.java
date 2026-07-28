public class Practice54 {
    public static void rot(int[] arr, int s, int e) {
        int temp = arr[0];

        while (s < e) {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void rev(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        rot(arr, 0, k - 1);
        rot(arr, k, n - 1);
        rot(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rev(arr, 2);
        System.out.println(" Array is after rotation");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
