public class Exception2 {
    public static void main(String[] var0) {
        int i = 2;
        int j = 0;

        try {

            String s = null;
            System.out.println(s.length());

            j = 18 / i;
            int[] num = new int[5];
            System.out.println(num[1]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zerp");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bonds");
        }

        catch (Exception e) {
            System.out.println("Somethimg went wrong" + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
