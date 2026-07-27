public class Practice48 {
    public static int num(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 78, 5, 25 };

        int result = num(arr, 25);
        System.out.println(result);
    }
}
