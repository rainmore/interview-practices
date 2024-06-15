package au.com.rainmore.java;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeadlockLalal {

//    @Test
    @RepeatedTest(100)
    void test_deadlock() {

        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() { alphonse.bow(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.bow(alphonse); }
        }).start();

    }

    private static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                            + "  has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    @Test
    void test2() {
        String la = lala();
        String lala = lala1(la);

        assertEquals("foo $kkk", la);
        assertEquals("foo ccc", lala);
    }

    private String lala() {
        return "foo $kkk";
    }

    private String lala1(String la) {
        String lala = la;
        la = la.replaceAll("\\$kkk", "ccc");
        return la;
    }


    @Test
    void test3() {

        String template = "Hi $firstname $lastname, welcome!";
        Map<String, String> map = Map.of("firstname", "James", "lastname", "Smith");

        String result = replace1(template, map);
        String expected = "Hi James Smith, welcome!";
        assertEquals(expected, result);

    }

    private String replace1(String template, Map<String, String> tokens) {
//        String result = template;

        for (Map.Entry<String, String> token: tokens.entrySet()) {
            String key = String.format("\\$%s", token.getKey());
//            result = new String(result.replaceAll(key, token.getValue()));
            template = template.replaceAll(key, token.getValue());
        }

        return template;
    }

    private String replace(String template, Map<String, String> tokens) {
        String keys = tokens.keySet()
                .stream()
                .collect(Collectors.joining("|"));
        Pattern pattern = Pattern.compile(String.format("\\$(%s)", keys));
        Matcher matcher = pattern.matcher(template);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()) {
            String replacement = tokens.get(matcher.group(1));
            if (replacement != null) {
                matcher.appendReplacement(sb, replacement);
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
