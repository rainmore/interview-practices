package au.com.rainmore.datastructure.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class NoPrefixSet {

    public static void main(String[] args) {

        List<String> words1 = List.of("aab", "defgab", "abcde", "aabcde", "bbbbbbbbbb", "jabjjjad");
        List<String> words2 = List.of("aab", "aac", "aacghgh", "aabghgh");

        List<String> words3 = List.of("ab", "bc", "cd");
        List<String> words4 = List.of("abcd", "bcd", "abcde", "bcde");

        List<String> words5 = List.of("abcd", "dbac", "ab");
        List<String> words6 = List.of("aab", "defgab", "abcde", "aabcde", "cedaaa", "bbbbbbbbbb", "jabjjjad");

        List<String> words7 = List.of("a", "a");


//        noPrefix1(words1);
//        noPrefix(words2);
//        noPrefix(words3);
//        noPrefix(words4);
//        noPrefix1(words5);
        noPrefix(words6);
        noPrefix(words7);
    }

    public static void noPrefix(List<String> words) {
        // Write your code here


        Map<String, Integer> possiblePrefix = new HashMap<>();
        Map<String, Integer> m = new HashMap<>();

        String badStr = null;


        for (String word : words) {

            String tmp = null;

            for (int i = 0; i < word.length(); i++) {
                tmp = word.substring(0, i + 1);
                if (i != word.length() - 1) {
                    possiblePrefix.put(tmp, possiblePrefix.getOrDefault(tmp, 0) + 1);
                }
                if (m.getOrDefault(tmp, 0) > 0) {
                    break;
                }
            }

            m.put(tmp, m.getOrDefault(tmp, 0) + 1);

            if (possiblePrefix.getOrDefault(tmp, 0) > 0
            || m.getOrDefault(tmp, 0) > 1) {
                badStr = word;
                break;
            }
        }

        if (badStr == null) {
            System.out.println("GOOD SET");
        }
        else {
            System.out.println("BAD SET");
            System.out.println(badStr);
        }
    }
}
