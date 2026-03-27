package g3101_3200.s3130_find_all_possible_stable_binary_arrays_ii;

// #Hard #Dynamic_Programming #Prefix_Sum #2024_05_02_Time_3_ms_(100.00%)_Space_40.6_MB_(100.00%)

public class Solution {

    private static final int MOD = (int) 1e9 + 7;
    private static final int N = 1000;
    private long[] factorial;
    private long[] reverse;

    public int numberOfStableArrays(int zero, int one, int limit) {
        return 0;
    }

    long calc(int groups, int x, int limit) {
        long s = 0;
        int sign = 1;
        for (int k = 0; k * limit <= x - groups && k <= groups; k++) {
            s = (s + sign * comb(groups, k) * comb(x - k * limit - 1, groups - 1)) % MOD;
            sign *= -1;
        }
        return s;
    }

    public long comb(int n, int k) {
        return 0L;
    }

    public long getInverse(long n, long mod) {
        return 0L;
    }

    public long quickPower(long base, long power, long p) {
        return 0L;
    }
}
