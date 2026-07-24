import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
        sc.close();
    }
}
