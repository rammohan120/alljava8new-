

import java.util.Arrays;
        import java.util.List;
        import java.util.Map;
        import java.util.stream.Collectors;

public class AllTheOperationsGroupingBy {
    public static void main(String[] args) {
        // Sample data
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "berry", "apricot", "avocado","banana");

        // Group words by their length
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by length: ======" + groupedByLength);

        // Group words by their first letter
        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println("Grouped by first letter: ====" + groupedByFirstLetter);

        // Count the occurrences of words by length
        Map<Integer, Long> wordCountByLength = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println("Word count by length:===== " + wordCountByLength);

        // Concatenate words in each group by length
        Map<Integer, String> concatenatedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.joining(", ")));

        System.out.println("Concatenated by length: ======" + concatenatedByLength);
        //Map<String,List<String>>mm=words.stream().collect(Collectors.groupingBy(s->s,Collectors.List.of()).stream().collect(Collectors.toList());

        Map<String, List<String>> mm = words.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.toList()));

     




        System.out.println("Duplicate----:"+mm);


    }


}
