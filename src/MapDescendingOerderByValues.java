
import java.util.HashMap;
        import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.stream.Collectors;



public class MapDescendingOerderByValues {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 5);
        map.put("two", 3);
        map.put("three", 8);
        map.put("four", 1);





        Map<String, Integer> sortedMap1= map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedMap1);

        Map<Integer,String>map1=new HashMap<>();
        map1.put(1,"ram");
        map1.put(5,"mohan");
        map1.put(4,"charan");




        Map<Integer, String> sortedMap = map1.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));


        System.out.println(sortedMap);
    }
}

