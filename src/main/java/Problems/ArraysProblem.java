package Problems;

import java.util.HashMap;
import java.util.HashSet;

public class ArraysProblem {

    public boolean PalindromePermutation(String str) {
        str = str.toLowerCase();
        HashSet<Character> values = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!" ".contains("" + c)) {
                if (values.contains(c)) {
                    values.remove(c);
                } else {
                    values.add(c);
                }
            }
        }
        return values.size() <= 1;
    }

    public boolean OneAway(String str1, String str2) {
        if (str1.length() == str2.length()) {
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    count++;
                    if (count > 1) {
                        return false;
                    }
                }
            }
            return true;
        } else if (Math.abs(str1.length() - str2.length()) == 1) {
            if (str1.length() > str2.length()) {
                return oneOff(str1, str2);
            } else {
                return oneOff(str2, str1);
            }
        } else {
            return false;
        }


    }

    private boolean oneOff(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i + count) != str2.charAt(i)) {
                count++;
                i--;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public String StringCompression(String str) {
        if (str.length() <= 2) {
            return str;
        }
        StringBuilder comp = new StringBuilder();
        int dups = 1;
        char last = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                dups++;
            } else {
                comp.append(last + "" + dups);
                dups = 1;
            }
            last = str.charAt(i);
        }
        comp.append(last + "" + dups);
        String compstr = comp.toString();
        if (compstr.length() < str.length()) {
            return compstr;
        } else {
            return str;
        }
    }


}
