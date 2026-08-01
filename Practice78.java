public class Practice78 {
    public static int[] fc(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        int ceil = -1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return new int[] { floor, ceil };

    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };
        int x = 7;

        int[] ans = fc(arr, x);

        System.out.println("Floor = " + ans[0]);
        System.out.println("Ceil = " + ans[1]);
    }

}
