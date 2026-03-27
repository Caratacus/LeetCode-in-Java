package g2201_2300.s2213_longest_substring_of_one_repeating_character;

// #Hard #Array #String #Ordered_Set #Segment_Tree
// #2025_03_25_Time_79_ms_(89.74%)_Space_66.05_MB_(89.74%)

public class Solution {

    private char[] ca;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        return null;
    }

    private class SegmentTree {
        final int start;
        final int end;
        int longest;
        int leftLength;
        int rightLength;
        SegmentTree left;
        SegmentTree right;

        SegmentTree(int start, int end) {
            this.start = start;
            this.end = end;
            if (end - start > 1) {
                int mid = (start + end) / 2;
                left = new SegmentTree(start, mid);
                right = new SegmentTree(mid, end);
                merge();
            } else {
                longest = leftLength = rightLength = 1;
            }
        }

        void update(int index) {
            if (end - start == 1) {
                return;
            }
            if (index < left.end) {
                left.update(index);
            } else {
                right.update(index);
            }
            merge();
        }

        private void merge() {}
    }
}
