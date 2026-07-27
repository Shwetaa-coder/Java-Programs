public class Practice47 {

    public static int num(int[] arr) {
        int largest = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sec = largest;
                largest = arr[i];
            } else if (arr[i] > sec && largest > arr[i]) {
                sec = arr[i];
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 78, 5, 25 };

        System.out.println(num(arr));
    }
}
