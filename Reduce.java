import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 7, 3, 2, 6);

        int sum = num.stream().reduce(0, (c, e) -> c + e);
        System.out.println("sum " + sum);

        Optional<Integer> product = num.stream().reduce((a, b) -> a + b);
        product.ifPresent(val -> System.out.println(" product " + val));

        int parallelSum = num.parallelStream()
                .reduce(0,
                        (subtotal, element) -> subtotal + element,
                        (subtotal1, subtotal2) -> subtotal1 + subtotal2);
        System.out.println("Parallel sum :" + parallelSum);
    }
}