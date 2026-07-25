import java.util.Scanner;

public class Practice35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        boolean b = true;
        if (n <= 1) {
            b = false;
        } else {
            for (int i = 2; (i * i) <= n; i++) {
                if (n % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
            sc.close();
        }
    }
}
