class Practice61 {
    public static int sub(int[] arr, int k) {
        int sum = 0;
        int maxl = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum == k) {
                    int l = j - i + 1;
                    if (l > maxl) {
                        maxl = l;
                    }
                }
            }
        }
        return maxl;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 1, 9 };

        int ans = sub(arr, 10);

        System.out.println(ans);
    }
}