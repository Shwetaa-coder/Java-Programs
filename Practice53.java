public class Practice53 {
    public static int dup(int[] arr) {
        int i = 0;
        if (arr.length == 0)
            return 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int k = dup(arr);
        System.out.println(" Unique number are " + k);
        System.out.print("Array = ");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
