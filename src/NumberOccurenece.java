import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOccurenece {
    public static void main(String[] args) {
        List<Integer> ll=List.of(1,2,4,3,2,12,12,3,4);
        for(Integer aa:ll){
//            Map<Integer,Long> map=new HashMap<>();
//            map.merge(aa, 1L,Long::sum);
//            Map<Integer, Long> map = ll.stream()
//                    .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
////            System.out.println(map);
//            Map<Integer, Integer> map1 =new HashMap<>();
//            map1.put(aa,map1.get( aa)+1);
//            System.out.println(map1);
            Map<Integer, Integer> occurrencesMap = new HashMap<>();

            // Iterate through the list and update the occurrences in the map
            for (Integer number : ll) {
                occurrencesMap.put(number, occurrencesMap.getOrDefault(number, 0) + 1);
            }
            System.out.println(occurrencesMap);

        }

    }
}
