public class D {
    public static void main(String[] args) {
        int x = 0;
        try {
            try {
                int[] a = { 1, 2, 3 };
                System.out.println(a[0]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("inner");
            }

            x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("outer" + e);
        } finally {
            System.out.println(x);
        }
    }
}
