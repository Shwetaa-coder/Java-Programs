
import java.util.Scanner;

public class tr {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a digit (0-9): ");
        int n = s.nextInt();

        int i = 0;
        int sum = 0;

        while (i < 50) {
            if (i % 10 == n) {
                sum = sum + i;
            }
            i++; // Move to the next number
        }

        System.out.println("Sum = " + sum);
    }

}
