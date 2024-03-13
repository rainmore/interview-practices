package au.com.rainmore.hackerrank;

import java.util.*;

public class Question2 {


    private static final int    DISCOUNT_0   = 0;
    private static final int    DISCOUNT_1   = 1;
    private static final int    DISCOUNT_2   = 2;
    private static final String EMPTY_STRING = "EMPTY";


    public int findLowestPrice(
            List<List<String>> products,
            List<List<String>> discounts) {

        int sum = 0;

        for (List<String> product: products) {

            Integer price = Integer.valueOf(product.get(0));

            if (product.size() == 1) {
                sum += price;
            }

            if (product.size() == 2) {

                sum += discount(price, product.get(1), discounts);
            }

            else if (product.get(2) == EMPTY_STRING && product.get(1) == EMPTY_STRING) {
                sum += price;
            }
            else {
                Integer sale1 = discount(price, product.get(1), discounts);
                Integer sale2 = discount(price, product.get(2), discounts);

                sum += Math.min(sale1, sale2);

            }

        }


        return sum;
    }

    private static int discount(Integer price, String discount, List<List<String>> discounts) {
        if (discounts == null || discounts.isEmpty() || discount.equals(EMPTY_STRING)) {
            return price;
        }
        Set<Integer> prices = new HashSet<>();
        for (List<String> cal : discounts) {
            if (discount.equals(cal.get(0))) {
                if (discount.equals(cal.get(0))) {
                    Integer tmp = Integer.valueOf(cal.get(2));
                    if (cal.get(1).equals("0")) {
                        prices.add(tmp);
                    }
                    if (cal.get(1).equals("1")) {
                        int dis = (int) Math.floor(price - price * (double) tmp / 100) ;
                        prices.add(dis);
                    }
                    if (cal.get(1).equals("2")) {
                        prices.add(price - tmp);
                    }
                }
            }
        }


        return prices.stream().mapToInt(v -> v).min().orElse(price);
    }

}
