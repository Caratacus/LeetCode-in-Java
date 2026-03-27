package g1901_2000.s1942_the_number_of_the_smallest_unoccupied_chair;

// #Medium #Array #Heap_Priority_Queue #Ordered_Set
// #2022_05_16_Time_73_ms_(49.69%)_Space_73.1_MB_(38.04%)

public class Solution {

    public int smallestChair(int[][] times, int targetFriend) {
        return 0;
    }

    private static class Person {
        boolean leave;
        boolean arrive;
        int time;
        int idx;

        Person(int idx, int time, boolean leave, boolean arrive) {
            this.time = time;
            this.leave = leave;
            this.arrive = arrive;
            this.idx = idx;
        }
    }
}
