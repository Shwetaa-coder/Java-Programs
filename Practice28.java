import java.util.Scanner;

class Practice28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // increasing
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            // dec
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
        sc.close();
    }
}
