import java.util.Scanner;

public class Practice37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        System.out.println("Enter num");
        int m = sc.nextInt();
        int t;

        while (m != 0) {
            t = m;
            m = n % m;
            n = t;
        }
        System.out.println("GCD " + n);
        sc.close();
    }
}
