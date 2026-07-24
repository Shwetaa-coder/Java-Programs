import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
