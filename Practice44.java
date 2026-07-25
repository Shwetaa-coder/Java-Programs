import java.util.Scanner;

public class Practice44 {
    public static boolean pal(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return pal(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        if (pal(str, 0, str.length() - 1)) {

            System.out.println("Is palindrome");
        } else {
            System.err.println("not");
            sc.close();
        }
    }
}