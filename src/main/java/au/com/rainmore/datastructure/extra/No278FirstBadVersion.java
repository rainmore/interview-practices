package au.com.rainmore.datastructure.extra;

/**
 * <a href="https://leetcode.com/problems/first-bad-version/">
 *     278. First Bad Version</a>
 *
 * Time Complexity:O(log n)
 * Space Complexity:O(1)
 */
public class No278FirstBadVersion {

    public int badVersion;


    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (isBadVersion(m)) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return l;
    }

    public int firstBadVersion2(int n) {
        int l = 1;
        int r = n;
        int tmp = 0;
        while (l <= r) {
            int m = l + ((r - l) / 2);

            if (isBadVersion(m)) {
                tmp = m;
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return tmp;
    }

    public int firstBadVersion1(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {
            int m = l + ((r - l) / 2);

            if (isBadVersion(m) && !isBadVersion(m - 1)) {
                return m;
            }
            else if (!isBadVersion(m)) {
                l = m + 1;
            }
            else {
                r = m;
            }

        }
        return -1;
    }

    private boolean isBadVersion(int version) {
        return version >= badVersion;
    }

}
