package au.com.rainmore;

import java.util.*;
import java.util.stream.Collectors;

public class TestJava {

    private String lala;


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int lines = 0;
//        List<String[]> input = new ArrayList<>();
//        int count = 0;
//
//        if (scanner.hasNextLine()) {
//            lines = Integer.valueOf(scanner.nextLine());
//        }
//
//        while (count < lines && scanner.hasNextLine()) {
//            String[] lala = scanner.nextLine().split(" ");
//            input.add(lala);
//            count++;
//        }
//
//        if (count >= lines) {
//            scanner.close();
//        }
//
//        input.forEach(i -> {
//            List<String> op = new ArrayList<>();
//            Double n1 = Double.valueOf(i[0]);
//            Integer n2 = Integer.valueOf(i[1]);
//            Integer n3 = Integer.valueOf(i[2]);
//            for (int j = 0; j < n3; j++) {
//                n1 += Math.pow(2, j) * n2;
//                op.add(String.format("%d", n1.intValue()));
//            }
//            System.out.println(String.join(" ", op));
//        });
//
//
////
////        System.out.println("================================");
////        for (int i = 0; i < l1.size(); i++) {
////            System.out.println(String.format("%-15s%03d", l1.get(i), l2.get(i)));
////        }
////        System.out.println("================================");

//        TestJava tj = new TestJava();
//
//        tj.lala(List.of("aab", "defgab", "abcde", "aabcde", "bbbbbbbbbb", "jabjjjad"));
//        tj.lala(List.of("aab", "aac", "aacghgh", "aabghgh"));
    }

    public void run() {
        System.out.println(m3("cde", "abc"));
        System.out.println(m3("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }

//    private Integer m1(String a, String b) {
//        Integer result = 0;
//
//        List<Character> aList = a.chars().mapToObj(e -> (char)e).toList();
//        List<Character> bList = b.chars().mapToObj(e -> (char)e).toList();
//
//
//
//        for (int i = 0; i < aList.size(); i++) {
//            if (bList.contains(aList.get(i))) {
//                b.replace(aList.get(i), ' ');
//            }
//            else {
//                result += 1;
//            }
//        }
//
//        char[] aa = a.toCharArray();
//
//        for (int i = 0; i < aa.length; i++) {
//            if (bList.contains(aa[i])) {
//                b.replace(aList.get(i), ' ');
//            }
//            else {
//                result += 1;
//            }
//        }
//
//        return result;
//    }

    private Integer m2(String a, String b) {
        int result = 0;
        char[] aa = a.toCharArray();

        for (int i = 0; i < aa.length; i++) {
            String str = String.valueOf(aa[i]);
            if (b.contains(str)) {
                b = b.replace(str, "");
            }
            else {
                result += 1;
            }
        }

        System.out.println(String.format("%s, %s", b, result));
        return result + b.length();
    }

    private Integer m3(String a, String b) {
        int result = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] aa = a.toCharArray();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int value : map.values()) {
            result += Math.abs(value);
        }

        System.out.println(String.format("%s, %s", b, result));
        return result;
    }

    private class ATest {
        private String a;

        private Long b;

        public ATest(String a, Long b) {
            this.a = a;
            this.b = b;
        }

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public Long getB() {
            return b;
        }

        public void setB(Long b) {
            this.b = b;
        }
    }

    private void collectionTest() {
        List<ATest> mutableList = new ArrayList<>();
        mutableList.add(new ATest("A", 1L));
        mutableList.add(new ATest("B", 2L));
        mutableList.add(new ATest("C", 3L));
        mutableList.add(new ATest("D", 4L));
        mutableList.add(new ATest("E", 5L));


        List<ATest> immutableList = List.copyOf(mutableList);
        List<ATest> immodifiedList = Collections.unmodifiableList(mutableList);

        mutableList.get(0).setA("AAA");

        assert immutableList.get(0).getA().equals("A");
        assert immodifiedList.get(0).getA().equals("A");

        immutableList.get(0).setA("AA");
        assert mutableList.get(0).getA() == "AAA";
        immodifiedList.get(0).setA("AA");
        assert mutableList.get(0).getA() == "AAA";

        assert mutableList.get(0).getA() == "A";
        assert immutableList.get(0).getA() == "AA";
        assert immodifiedList.get(0).getA() == "AA";
    }

    private void lala(List<String> words) {
        Optional<String> result = words.stream().filter(word -> {
            boolean r = !hasNode(words, word);
            System.out.println(String.format("Searching \"%s\", resutl: '%s'", word, r));
            return r;
        }).findFirst();
        if (result.isEmpty()) {
            System.out.println("GOOD SET");
        }
        else {
            System.out.println("BAD SET");
            System.out.println(result.get());
        }
    }

    private boolean hasNode(List<String> words, String word) {
        return words.stream().anyMatch(w -> {

            boolean r = !w.equals(word) && w.startsWith(word);
            return r;
        });
    }
}
