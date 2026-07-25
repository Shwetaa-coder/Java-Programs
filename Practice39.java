import java.util.Scanner;

public class Practice39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println("Divisors are " + i);
        }
        sc.close();
    }
}
