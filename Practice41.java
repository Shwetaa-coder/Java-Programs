import java.util.Scanner;

public class Practice41 {
    public static void rec(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        rec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        rec(n);
        sc.close();
    }
}
