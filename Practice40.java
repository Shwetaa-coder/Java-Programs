import java.util.Scanner;

public class Practice40 {
    public static void rec(int n) {
        if (n == 0) {
            return;
        }
        rec(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        rec(n);
        sc.close();
    }
}
