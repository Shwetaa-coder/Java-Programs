class ShwetaException extends Exception {
    public ShwetaException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new ShwetaException("manually thrown exception");
            }
        } catch (ShwetaException s) {
            j = 18 / 1;
            System.out.println("Custom exception caught : " + s);
        }
        System.out.println("Final value of j : " + j);
        System.out.println("bye");

    }
}
