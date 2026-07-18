public class ExceptionDemo1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            int[] num = new int[5];
            j = 18 / i; // Risky code may throw arithmetic exception
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
