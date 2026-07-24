class T {
    static void ch(int n) {
        if (n == 0) {
            throw new ArithmeticException("exception");
        }
        System.out.println("valid");
    }

    public static void main(String[] args) {
        try {
            ch(1);
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
    }
}
