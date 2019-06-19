package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

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

    public ArrayList<String> generateParem(int n) {
        ArrayList<String> out = new ArrayList<>();
        generateParem(out, n, n, "");
        return out;

    }

    private void generateParem(ArrayList<String> out, int left, int right, String current) {

        if (left == 0 && right == 0) {
            out.add(current);
            return;
        }
        if (left > 0) {
            generateParem(out, left - 1, right, current + "(");
        }
        if (right > left) {
            generateParem(out, left, right - 1, current + ")");
        }
    }

    public ArrayList<String> makeChange(int[] coins, int n) {
        HashMap<Integer, Integer> coinVal = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();
        HashSet<HashMap<Integer,Integer>> visited= new HashSet<>();
        for (int i = 0; i < coins.length; i++) {
            coinVal.put(coins[i], 0);
        }
        makeChange(visited,output,coinVal, n);
        return output;
    }

    public void makeChange(HashSet<HashMap<Integer,Integer>> visited, ArrayList<String> output, HashMap<Integer, Integer> coinVal, int n) {

        visited.add(coinVal);
        int sum=0;
        for (Map.Entry<Integer, Integer> entry : coinVal.entrySet()) {
            sum+=entry.getKey()*entry.getValue();
        }
        if(sum>n){
            return;
        }if(sum==n){
            String s="\n";
            for (Map.Entry<Integer, Integer> entry : coinVal.entrySet()) {
                s=s+"\t"+entry.getKey()+":"+entry.getValue();
            }
            output.add(s+"\n");
            return;
        }
        for (Map.Entry<Integer, Integer> entry : coinVal.entrySet()) {
            int val = entry.getValue();
            coinVal.put(entry.getKey(),val+1);
            makeChange(visited,output,coinVal,n);
            coinVal.put(entry.getKey(),val);
        }
    }


}
