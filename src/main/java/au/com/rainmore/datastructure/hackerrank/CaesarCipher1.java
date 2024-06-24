package au.com.rainmore.datastructure.hackerrank;

import java.util.List;

public class CaesarCipher1 {

    public static void main(String[] args) {

        String r1 = caesarCipher("middle-Outz", 2);
        assert r1.equals("okffng-Qwvb");

        String r2 = caesarCipher("Hello_World!", 4);
        assert r2.equals("Lipps_Asvph!");


        String r3 = caesarCipher("www.abc.xy", 87);
        assert r3.equals("fff.jkl.gh") == true;
    }

    public static String caesarCipher(String s, int k) {
        // A - Z => 65 -> 91
        // a - z => 97 -> 123

        StringBuilder sb = new StringBuilder();

        int ca = 'a';
        int cA = 'A';

        int cz = 'z';
        int cZ = 'Z';


        for (int i = 0; i < s.length(); i ++) {
            int c = s.charAt(i);

            if (c >= ca && c <= cz) {
                c = (c - ca + k) % 26;
                c += ca;
            }
            else if (c >= cA && c <= cZ) {
                c = (c - cA + k) % 26;
                c += cA;
            }

            sb.append((char) c);
        }

        return sb.toString();
    }

}
