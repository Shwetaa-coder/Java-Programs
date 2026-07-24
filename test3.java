import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter low");
        int low = s.nextInt();
        System.out.println("enter high");
        int high = s.nextInt();

        for (int i = low; i <= high; i++) {
            sum = sum + i;
        }
        System.out.println("sum" + sum);
        s.close();
        ;
    }
}
