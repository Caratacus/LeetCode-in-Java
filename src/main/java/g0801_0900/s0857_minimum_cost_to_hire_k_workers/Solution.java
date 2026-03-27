package g0801_0900.s0857_minimum_cost_to_hire_k_workers;

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2022_03_27_Time_26_ms_(85.40%)_Space_42.6_MB_(95.75%)

public class Solution {

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        return 0.0;
    }

    static class Worker {
        int wage;
        int quality;

        double ratio() {
            return (double) wage / quality;
        }

        Worker(int wage, int quality) {
            this.wage = wage;
            this.quality = quality;
        }
    }
}
