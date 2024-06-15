package au.com.rainmore.java;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringTest {
    String example = "Hello, World!";

    @Test
    void testEquals() {
        String s1 = example;
        String s2 = example;
        String s3 = new String(s2);

        assertEquals(s1, s2);
        assertTrue(s1 == s2);
        assertTrue(s1.equals(s2));

        assertEquals(s3, s2);
        // S3 is a new instance, which doesn't re-use from the String pool
        assertFalse(s3 == s2);
        assertTrue(s3.equals(s2));


        String s4 = s2;
        s4 = "Hello, Felix!";

        assertFalse(s4 == s2);
        assertFalse(s4.equals(s2));


        String s5 = s2;
        s5 = s5 + "lala";

        assertFalse(s5 == s2);
        assertFalse(s5.equals(s2));

        s4 = s4.replaceAll("Felix", "World");

        assertFalse(s4 == s2);
        assertTrue(s4.equals(example));
    }

    @Test
    void testImmutable() {

        String template = "Hi $firstname $lastname, welcome!";
        Map<String, String> map = Map.of("firstname", "James", "lastname", "Smith");

        String result = replace(template, map);
        String expected = "Hi James Smith, welcome!";
        assertEquals(expected, result);
        assertTrue(expected.equals(result));
    }

    private String replace(String template, Map<String, String> tokens) {
        String result = template;

        tokens.put("lala", "lala");
        for (Map.Entry<String, String> token: tokens.entrySet()) {
            String key = String.format("\\$%s", token.getKey());
            // result won't be updated as it is immutable
            result = result.replaceAll(key, token.getValue());
            // `new` keyword allows to override the string
//            result = new String(result.replaceAll(key, token.getValue()));
            // or replace `result` with a different string
//            String replacement = result.replaceAll(key, token.getValue());
//            result = replacement;
        }

        return result;
    }

    @Test
    void test3() {
        String hello = "Hello";
        String hello1 = hello;
        hello = hello.replace("Hello", "Hello World");

        assertEquals("Hello World", hello);
        assertEquals("Hello", hello1);
    }


}
