package g3701_3800.s3715_sum_of_perfect_square_ancestors;

// #Hard #Array #Hash_Table #Math #Depth_First_Search #Tree #Counting #Number_Theory
// #Weekly_Contest_471 #2025_10_14_Time_122_ms_(98.09%)_Space_123.31_MB_(49.05%)

import java.util.List;
import java.util.Map;

public class Solution {

    private static final int MAX = 100000;
    // smallest prime factor
    private static final int[] SPF = new int[MAX + 1];

    // Precompute smallest prime factors for fast factorization
    static {
        for (int i = 2; i <= MAX; i++) {
            if (SPF[i] == 0) {
                for (int j = i; j <= MAX; j += i) {
                    if (SPF[j] == 0) {
                        SPF[j] = i;
                    }
                }
            }
        }
    }

    public long sumOfAncestors(int n, int[][] edges, int[] nums) {
        return 0L;
    }

    private long dfs(
            int node, int parent, List<List<Integer>> adj, int[] nums, Map<Integer, Integer> freq) {
        return 0L;
    }

    // Compute square-free kernel using prime factorization parity
    private long getKernel(int x) {
        return 0L;
    }
}
