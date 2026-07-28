public class Practice58 {
    public static int cons(int[] arr) {
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        System.out.println(cons(arr));
    }
}
