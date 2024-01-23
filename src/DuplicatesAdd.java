

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
        import java.util.function.Function;
        import java.util.stream.Collectors;

public class DuplicatesAdd {
    public static void main(String[] args) {
        String inputString = "programming";

        printDuplicates(inputString);
    }

    public static void printDuplicates(String input) {
        for (Character c : input.toCharArray()) {
            List<Character> ll = new ArrayList<>();
            ll.add(c);

            Map<Character, Long> lm = ll.stream().collect(Collectors.groupingBy(d -> d, Collectors.counting()));

            for (Map.Entry<Character, Long> entry : lm.entrySet()) {

                if (entry.getValue() <= 1) {
                    System.out.println(entry.getKey());

                }
            }
        }
//        Map<String, Long> charFrequencyMap = input.chars()
//                .mapToObj(c -> String.valueOf((char) c))
//                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
//
//        charFrequencyMap.entrySet().stream()
//                .filter(entry -> entry.getValue() <=2)
//                .forEach(entry -> System.out.println("Duplicate character: " + entry.getKey()+"=value :"+entry.getValue()));
//    }
    }
}

