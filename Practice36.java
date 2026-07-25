import java.util.Scanner;

public class Practice36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        int temp = n;
        int og = n;
        int sum = 0;
        int digit = 0;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = n;

        while (temp > 0) {
            int d = temp % 10;

            sum += (int) Math.pow(d, digit);
            temp = temp / 10;
        }
        if (sum == og) {
            System.out.println("Is Armstrong");
        } else {
            System.out.println("Is not");
        }
        sc.close();
    }
}
