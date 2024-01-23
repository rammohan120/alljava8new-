
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCharatersPrint {
    public static void main(String[] args) {
        List<Character> ll = List.of('a', 'b', 'c', 'a', 'b', 'd', 'e', 'f', 'f');

        Map<Character, Long> lm = ll.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        for (Map.Entry<Character, Long> entry : lm.entrySet()) {
            if (entry.getValue() <= 1) {
                System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}

