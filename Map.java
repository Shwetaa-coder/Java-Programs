import java.util.List;
import java.util.Arrays;
import java.util.function.Function;

public class Map {
    public static void main(String[] args) {
        List<Integer> num = Arrays .asList(4,7,3,2,6)
        Function<Integer,Integer> fun = new Function<Integer , Integer>()
        {
            public Integer apply(Integer n)
            {
                return n*2;
            }
        };
        num.stream()
        .map(n->n*2)
        .forEach(n-> System.out.println(n));

    }
}
