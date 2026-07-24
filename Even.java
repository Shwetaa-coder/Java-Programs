public class Even {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int even = 0;
        int odd = 0;
        for (int arr : a) {
            if (arr % 2 == 0) {
                even++;
            } else
                odd++;
        }
        System.out.println("even : " + even + " " + "odd : " + odd);
    }
}
