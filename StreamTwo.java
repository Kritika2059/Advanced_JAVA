import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(86);
        list.add(67);
        list.add(54);
        list.add(-23);
        list.add(73);
        list.add(37);
        list.add(47);
        list.add(68);
        Stream<Integer> sorted = list.stream().sorted();
        sorted.forEach(n -> System.out.println(n));
    }
}