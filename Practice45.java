import java.util.Scanner;

public class Practice45 {
    public static int rec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return rec(n - 1) + rec(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        System.out.println(rec(n));
        sc.close();
    }
}
