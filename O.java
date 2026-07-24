import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("enter");
            int a = s.nextInt();
            System.out.println("enter");
            int b = s.nextInt();
            System.out.println("ans : " + (a / b));
        } catch (ArithmeticException a) {
            System.out.println("invalid");
        }
    }
}
