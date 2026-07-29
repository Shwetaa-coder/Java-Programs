public class Practice64 {
    public static int maj(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > (arr.length) / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println(maj(arr));
    }
}
