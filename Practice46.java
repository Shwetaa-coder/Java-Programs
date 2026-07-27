class Practice46 {
    public static int num(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 78, 5, 25 };

        System.out.println(num(arr));
    }
}