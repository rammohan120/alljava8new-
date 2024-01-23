
import java.util.List;
        import java.util.Map;
        import java.util.stream.Collectors;
        import java.util.stream.IntStream;

public class GroupingBy {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());

        // Group numbers by even or odd using Java 8 groupingBy
        Map<Boolean, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        // Separate even and odd lists
        List<Integer> evenNumbers = groupedNumbers.get(true);
        List<Integer> oddNumbers = groupedNumbers.get(false);

        // Print the lists
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
        List<Integer>even=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);
        List<Integer>odd=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(odd);

    }
}
