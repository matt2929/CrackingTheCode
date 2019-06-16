package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DynamicProgramingProblem {

    public ArrayList<String> generatePerm(String str) {
        ArrayList<String> outSet = new ArrayList<>();
        generatePermHelper("", outSet, str);
        return outSet;
    }

    private void generatePermHelper(String in, ArrayList<String> outSet, String inSet) {
        if (inSet.length() == 0) {
            outSet.add(in);
            return;
        }
        for (int i = 0; i < inSet.length(); i++) {
            generatePermHelper(in + inSet.charAt(i), outSet, inSet.substring(0, i) + inSet.substring(i + 1));
        }
    }

    public ArrayList<String> generatePermDup(String str) {
        HashMap<Character, Integer> remainder = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            remainder.put(str.charAt(i), remainder.getOrDefault(str.charAt(i), 0) + 1);
        }
        generatePermHelperDup("", output, remainder, str.length());
        return output;
    }

    private void generatePermHelperDup(String in, ArrayList<String> outSet, HashMap<Character, Integer> remainder, int remaining) {
        if (in.length() == remaining) {
            outSet.add(in);
            return;
        }
        for (Character c : remainder.keySet()) {
            if (remainder.get(c) > 0) {
                int count = remainder.get(c);
                remainder.put(c, remainder.get(c) - 1);
                generatePermHelperDup(in + "" + c, outSet, remainder, remaining);
                remainder.put(c, count);
            }

        }
    }

}
