import java.util.Scanner;

public class Practice29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= n - i; j--) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
