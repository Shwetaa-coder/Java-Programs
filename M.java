public class M {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException a) {
            System.out.println("Arithmetic except");
        } catch (NullPointerException n) {
            System.out.println("Null except");
        } catch (Exception e) {
            System.out.println("genral except");
        }
    }
}
