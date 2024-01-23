import java.util.*;

public class Stringsgroup {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "AA", "CC", "CC", "CC", "BB");
        String s1="AA";

        for(String ss:list){
          Map<String, List<String>> lm=new HashMap<>();
            lm.computeIfAbsent(s1,k->new ArrayList<>()).add(ss);
            System.out.println(lm.values());
        }
    }
}
