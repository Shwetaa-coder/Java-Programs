public class Practice67 {
    public static int[] num(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int p = 0;
        int negative = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[p] = arr[i];
                p++;
            } else {
                neg[negative] = arr[i];
                negative++;
            }
        }
        int[] r = new int[n];
        int posI = 0;
        int negI = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                r[i] = pos[posI];
                posI++;
            } else {
                r[i] = neg[negI];
                negI++;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 1, -2, -5, 2, -4 };

        int[] ans = num(arr);

        for (int number : ans) {
            System.out.print(number + " ");
        }
    }
}
