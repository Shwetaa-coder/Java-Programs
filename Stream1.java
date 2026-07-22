import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 5, 7, 2);
        num.forEach(n -> System.out.println(n));
    }
}
