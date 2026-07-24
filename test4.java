import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int n = sc.nextInt();

        int sum = 0;
        int i = 0;
        while (i < 50) {
            while (i % 10 == n) {
                sum = sum + i;
                i++;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();

    }
}
