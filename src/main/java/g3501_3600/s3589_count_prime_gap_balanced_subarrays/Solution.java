package g3501_3600.s3589_count_prime_gap_balanced_subarrays;

// #Medium #Array #Math #Sliding_Window #Queue #Number_Theory #Monotonic_Queue
// #2025_06_23_Time_407_ms_(100.00%)_Space_56.17_MB_(100.00%)

import java.util.Arrays;

@SuppressWarnings("java:S5413")
public class Solution {

    private static final int MAXN = 100005;
    private final boolean[] isPrime;

    public Solution() {
        isPrime = new boolean[MAXN];
        Arrays.fill(isPrime, true);
        sieve();
    }

    void sieve() {
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < MAXN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAXN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public int primeSubarray(int[] nums, int k) {
        return 0;
    }
}
