import java.util.Scanner;

public class Practice33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        int d;
        int rev = 0;
        while (n > 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
