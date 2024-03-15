package au.com.rainmore.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Atlassian interview question
 */
public class WrapLines {

    /**
     * tmp's length >= max --> add tmp to result
     * tmp's length + next's length + 1 > max --> add tmp to result
     * the last item -> add to result
     *
     * @param argv
     * @param max
     * @return
     */
    public List<String> wrapLines(String[] argv, int max) {
        List<String> result = new ArrayList<>();

        String tmp = "";
        for (int i = 0; i < argv.length; i++) {
            String t = tmp + ((tmp.isEmpty()) ? argv[i] : ("-" + argv[i]));
            int l = tmp.length() + t.length();

            if (l >= max ||
                    (i + 1) < argv.length && (l + 1 + argv[i + 1].length()) > max ||
                    i == argv.length - 1) {
                result.add(t);
                tmp = "";
            } else {
                tmp = t;
            }
        }
        return result;
    }

    public List<String> wrapLines1(String[] argv, int max) {
        List<String> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        String tmp = "";
        for (int i = 0; i < argv.length; i++) {
            StringBuilder sbt = new StringBuilder();
            sbt.append(tmp);
            if (!tmp.isEmpty()) sbt.append("-");
            sbt.append(argv[i]);

            int l = sb.length() + sbt.length();

            if (l >= max || // current is valid
                    (i + 1) < argv.length && (l + 1 + argv[i + 1].length()) > max || // next is valid
                    i == argv.length - 1) { // last one
                result.add(sbt.toString());
                sb = new StringBuilder();
            } else {
                sb.append(sbt.toString());
            }
        }

        return result;
    }


}
