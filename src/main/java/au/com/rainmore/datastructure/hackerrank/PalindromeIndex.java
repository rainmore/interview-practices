package au.com.rainmore.datastructure.hackerrank;

public class PalindromeIndex {

    public static int palindromeIndex(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        int n = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                if (s.charAt(i) == s.charAt(n - 1 - i) && s.charAt(i + 1) == s.charAt(n - 2 - i)) {
                    return n - i;
                } else {
                    return i;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        String test1 = "aaab";
        String test2 = "baa";
        String test3 = "aaa";

        System.out.println(String.format("%s result should be 3", palindromeIndex(test1)));
        System.out.println(String.format("%s result should be 0", palindromeIndex(test2)));
        System.out.println(String.format("%s result should be -1", palindromeIndex(test3)));

    }

}
