package au.com.rainmore.datastructure.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-grid-challenge
 */

public class GridChallenge {

    public static String gridChallenge(List<String> grid) {
        char[][] gridArray = new char[grid.get(0).length()][grid.size()];
        // Write your code here
        for (int i = 0; i < grid.size(); i++) {
            char[] arr = grid.get(i).toCharArray();
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                gridArray[j][i] = arr[j];
            }
        }

        boolean result = true;
        for (int i = 0; i < gridArray.length; i++) {
            char[] arr = Arrays.copyOf(gridArray[i], gridArray[i].length);
            Arrays.sort(arr);
            if (!Arrays.equals(arr, gridArray[i])) {
                result = false;
                break;
            }
        }
        return result ? "YES" : "NO";
    }


    public static void main(String[] args) {
        List<String> grid1 = List.of("mpxz", "abcd", "wlmf");
        System.out.println(gridChallenge(grid1));
        assert gridChallenge(grid1).equals("NO");
    }
}
