public class Ai {
    static void i(int n) {
        if (n < 18) {
            throw new IllegalArgumentException("invalid");
        }
        System.out.println("valid");
    }

    public static void main(String[] args) {
        try {
            i(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
