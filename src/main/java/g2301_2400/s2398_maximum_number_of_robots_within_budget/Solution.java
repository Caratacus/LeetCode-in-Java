package g2301_2400.s2398_maximum_number_of_robots_within_budget;

// #Hard #Array #Binary_Search #Heap_Priority_Queue #Prefix_Sum #Sliding_Window #Queue
// #2022_09_19_Time_15_ms_(99.75%)_Space_105.9_MB_(85.13%)

public class Solution {

    // use sliding window to track the largest in a way that the sliding window only grows.
    //   then the maximum size is the size of the sliding window at the end.
    // if condition is met, we just grow the sliding window.
    // if condition is not met, we shift the sliding window with the same size to the next position.
    // e.g., if [0,3] is valid, next time we will try [0,4].
    //       if [0,3] is invalid, next time we will try [1,4],
    //         by adjusting the window to [1,3] first in the current round.
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        return 0;
    }
}
