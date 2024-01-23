
    import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    public class Java8ArraysStreams {
        public static void main(String[] args) {
            List<String> list = Arrays.asList( "CC", "CC", "CC", "BB", "BB");

            Map<List<String>, Long> result = list.stream()
                    .collect(Collectors.groupingBy(s -> s.equals(list.get(0)) ? Arrays.asList(s) : Arrays.asList(), Collectors.counting()));

            System.out.println(result);
        }
    }





