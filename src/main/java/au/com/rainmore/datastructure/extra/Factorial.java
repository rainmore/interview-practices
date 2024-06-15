package au.com.rainmore.datastructure.extra;

public class Factorial {

    /**
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }

    /**
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int factorial1(int n) {
        int r = 1;
        while (n > 1) {
            r = r * n;
            n--;
        }
        return r;
    }

}
