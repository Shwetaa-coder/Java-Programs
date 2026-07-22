import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.get(2);
        l.addLast(4);
        l.addFirst(0);
        l.getFirst();
        l.getLast();
        System.out.println(l);
        l.removeIf(x -> x % 2 == 0);
        System.out.println(l);

        LinkedList<String> a = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> b = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        a.removeAll(b);
        System.out.println(a);

    }
}
