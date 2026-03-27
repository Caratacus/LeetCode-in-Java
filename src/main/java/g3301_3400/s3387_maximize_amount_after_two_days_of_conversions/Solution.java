package g3301_3400.s3387_maximize_amount_after_two_days_of_conversions;

// #Medium #Array #String #Depth_First_Search #Breadth_First_Search #Graph
// #2024_12_18_Time_7_ms_(87.88%)_Space_47.5_MB_(43.35%)

import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("java:S3824")
public class Solution {

    private double res;
    private Map<String, List<Pair>> map1;
    private Map<String, List<Pair>> map2;

    private static class Pair {
        String tarcurr;
        double rate;

        Pair(String t, double r) {
            tarcurr = t;
            rate = r;
        }
    }

    private void solve(
            String currCurrency, double value, String targetCurrency, int day, Set<String> used) {}

    public double maxAmount(
            String initialCurrency,
            List<List<String>> pairs1,
            double[] rates1,
            List<List<String>> pairs2,
            double[] rates2) {
        return 0.0;
    }
}
