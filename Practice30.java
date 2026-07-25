import java.util.Scanner;

public class Practice30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        int size = 2 * n - 1;
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int right = size - 1 - i;
                int bottom = size - 1 - j;
                int layer = Math.min((Math.min(i, j)), (Math.min(right, bottom)));
                System.out.print(n - layer + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
