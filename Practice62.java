public class Practice62 {
    public static int sum(int[] arr) {
        int sum = 0;
        int maxl = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum == 0) {
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

        int[] arr = { 1, -1, 3, 2, -2, -3, 3 };

        System.out.println(sum(arr));
    }
}
