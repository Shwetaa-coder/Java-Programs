import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 7, 3, 2, 6);
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        num.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

    }
}
