public class L {
    public static void main(String[] args) {
        try {
            int[] a = { 1, 2, 3 };
            System.out.println(a[5]);
            int x = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("except");
        }
    }
}
