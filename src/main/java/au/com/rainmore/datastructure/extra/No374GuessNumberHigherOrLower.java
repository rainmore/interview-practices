package au.com.rainmore.datastructure.extra;

/**
 * <a href="https://leetcode.com/problems/binary-search/">
 *     704. Binary Search</a>
 *
 * Time Complexity:O(log n)
 * Space Complexity:O(1)
 */
public class No374GuessNumberHigherOrLower {


    public int pick;

    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int m = l + ((r - l) / 2);
            int g = guess(m);
            switch (g) {
                case -1:
                    r = m - 1;
                    break;
                case 1:
                    l = m + 1;
                    break;
                case 0:
                    return m;
            }
        }
        return -1;
    }

    private int guess(int n) {
        if (n > pick) return 1;
        else if (n < pick) return -1;
        return 0;
    }

}
