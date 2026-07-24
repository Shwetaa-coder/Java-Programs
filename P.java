class P {
    public static void main(String[] args) {
        try {
            // int n = Integer.parseInt("abc");
            int n = 10;
            System.out.println(n);
        } catch (NumberFormatException n) {
            System.out.println("invalid");
        }
    }
}