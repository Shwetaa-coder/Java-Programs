public class ThrowDemo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("Manually thrown exception : Division by zero not allowed");
            }
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Caught Arithemetic exception , setting default value : " + j);
        }
        System.out.println("Final value of j : " + j);
        System.out.println("bye");
    }
}
