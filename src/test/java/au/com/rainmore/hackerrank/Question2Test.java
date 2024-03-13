package au.com.rainmore.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question2Test {

    private Question2 test = new Question2();

    @Test
    void test1() {
        List<List<String>> products = List.of(
                List.of("10", "sale", "january-sale"),
                List.of("200", "sale", "EMPTY"));

        List<List<String>> discounts = List.of(
                List.of("sale", "0", "10"),
                List.of("january-sale", "1", "10"));

        int r = test.findLowestPrice(products, discounts);

        assertEquals(19, r);
    }

    @Test
    void test2() {
        List<List<String>> products = List.of(
                List.of("100", "dcoupon1"),
                List.of("50", "dcoupon1"),
                List.of("30", "dcoupon1"),
                List.of("100", "dcoupon2"),
                List.of("50", "dcoupon2"),
                List.of("30", "dcoupon2"));

        List<List<String>> discounts = List.of(
                List.of("dcoupon1", "0", "60"),
                List.of("dcoupon1", "1", "30"),
                List.of("dcoupon1", "1", "20"),
                List.of("dcoupon2", "2", "20"),
                List.of("dcoupon2", "1", "85"),
                List.of("dcoupon2", "0", "15"));

        int r = test.findLowestPrice(products, discounts);

        assertEquals(142, r);
    }

}
