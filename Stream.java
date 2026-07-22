import java.util.List;
import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 5, 7, 2);
        int sum = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
