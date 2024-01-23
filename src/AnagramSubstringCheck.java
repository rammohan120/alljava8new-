import java.util.HashMap;
import java.util.Map;

public class AnagramSubstringCheck {
    public static void main(String[] args) {
        String mainString = "cbaebabacd";
        String targetString = "abc";

        findAnagramSubstrings(mainString, targetString);
    }

    private static void findAnagramSubstrings(String mainString, String targetString) {
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : targetString.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int requiredChars = targetMap.size();
        int formedChars = 0;

        Map<Character, Integer> windowMap = new HashMap<>();

        while (right < mainString.length()) {
            char currentChar = mainString.charAt(right);

            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (targetMap.containsKey(currentChar) && windowMap.get(currentChar).equals(targetMap.get(currentChar))) {
                formedChars++;
            }

            while (formedChars == requiredChars) {
                if (right - left + 1 == targetString.length()) {
                    System.out.println("Anagram substring found: " + mainString.substring(left, right + 1));
                }

                char leftChar = mainString.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    formedChars--;
                }

                left++;
            }

            right++;
        }
    }
}
