import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class SameStringsintoArray {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("AA", "AA", "CC", "CC", "CC", "BB","BB");

//            List<List<String>> result = list.stream()
//                    .collect(Collectors.groupingBy(s -> s))
//                    .values()
//                    .stream()
//                    .collect(Collectors.toList());
            List<List<String>> result = list.stream()
                    .collect(Collectors.groupingBy(s -> s))
                    .values().stream()
                    .collect(Collectors.toList());

            System.out.println(result);
        }
    }



