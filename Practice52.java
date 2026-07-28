public class Practice52 {
    public static void rot(int[] arr) {
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rot(arr);
        System.out.println(" Array is after rotation");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
