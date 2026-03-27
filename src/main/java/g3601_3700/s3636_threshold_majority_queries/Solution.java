package g3601_3700.s3636_threshold_majority_queries;

// #Hard #Array #Hash_Table #Binary_Search #Prefix_Sum #Counting #Divide_and_Conquer
// #Biweekly_Contest_162 #2025_08_14_Time_83_ms_(96.87%)_Space_71.30_MB_(75.24%)

public class Solution {

    private int[] nums;
    private int[] indexToValue;
    private int[] cnt;
    private int maxCnt = 0;
    private int minVal = 0;

    private static class Query {
        int bid;
        int l;
        int r;
        int threshold;
        int qid;

        Query(int bid, int l, int r, int threshold, int qid) {
            this.bid = bid;
            this.l = l;
            this.r = r;
            this.threshold = threshold;
            this.qid = qid;
        }
    }

    public int[] subarrayMajority(int[] nums, int[][] queries) {
        return null;
    }

    private void add(int i) {}
}
