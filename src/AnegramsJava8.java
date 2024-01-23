import java.util.*;

public class AnegramsJava8 {

        public static  Collection<List<String>> groupAnagrams(String[] strs) {


            Map<String, List<String>> anagramGroups = new HashMap<>();

            for (String str : strs) {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String sortedStr = new String(charArray);


               //anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
               // anagramGroups.c

                anagramGroups.computeIfAbsent(sortedStr,k->new ArrayList<>()).add(str);

            }
            System.out.println(anagramGroups);

            return anagramGroups.values();
        }

        public static void main(String[] args) {
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat","aet"};
            Collection<List<String>> result = groupAnagrams(strs);

            System.out.println(result);
        }
    }

