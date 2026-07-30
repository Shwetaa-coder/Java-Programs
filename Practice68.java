public class Practice68 {
    public static void per(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for (int i = n - 2; i > n - 1; i--) {
            if (arr[i] < arr[i + 1]) {
                i = pivot;
                break;
            }
        }
        if (pivot == -1) {
            rev(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                int t = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = t;
                break;
            }
        }
        rev(arr, pivot + 1, n - 1);
    }

    public static void rev(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 7, 4, 3, 1 };

        per(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
