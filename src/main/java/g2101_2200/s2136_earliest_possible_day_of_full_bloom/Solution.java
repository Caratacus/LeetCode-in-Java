package g2101_2200.s2136_earliest_possible_day_of_full_bloom;

// #Hard #Array #Sorting #Greedy #2022_06_04_Time_63_ms_(94.92%)_Space_53.4_MB_(97.46%)

@SuppressWarnings("java:S1210")
public class Solution {

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        return 0;
    }

    static class Seed implements Comparable<Seed> {
        int plantTime;
        int growTime;

        Seed(int plantTime, int growTime) {
            this.plantTime = plantTime;
            this.growTime = growTime;
        }

        public int compareTo(Seed s) {
            return 0;
        }
    }
}
