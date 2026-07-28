public class Practice55 {
    public static void sw(int[] arr) {
        int temp = arr[0];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };

        sw(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
