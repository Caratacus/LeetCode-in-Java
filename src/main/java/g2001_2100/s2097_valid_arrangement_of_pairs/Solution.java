package g2001_2100.s2097_valid_arrangement_of_pairs;

// #Hard #Depth_First_Search #Graph #Eulerian_Circuit
// #2022_05_25_Time_158_ms_(100.00%)_Space_122.1_MB_(92.55%)

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[][] validArrangement(int[][] pairs) {
        return null;
    }

    private HashMap<Integer, Queue<Integer>> getAdList(
            int[][] pairs, HashMap<Integer, int[]> inOutEdge) {
        HashMap<Integer, Queue<Integer>> adList = new HashMap<>();
        for (int[] pair : pairs) {
            int s = pair[0];
            int d = pair[1];
            Queue<Integer> set = adList.computeIfAbsent(s, k -> new LinkedList<>());
            set.add(d);
            int[] sEdgeCnt = inOutEdge.computeIfAbsent(s, k -> new int[2]);
            int[] dEdgeCnt = inOutEdge.computeIfAbsent(d, k -> new int[2]);
            sEdgeCnt[1]++;
            dEdgeCnt[0]++;
        }
        return adList;
    }

    private int getRes(int k, HashMap<Integer, Queue<Integer>> adList, int[][] res, int idx) {
        return 0;
    }

    private int getStart(HashMap<Integer, int[]> map) {
        return 0;
    }
}
