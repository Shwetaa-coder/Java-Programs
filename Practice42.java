import java.util.Scanner;

public class Practice42 {
    public static int rec(int n) {
        if (n == 0) {
            return 0;
        }

        return n + rec(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        System.out.println(rec(n));
        sc.close();
    }
}
