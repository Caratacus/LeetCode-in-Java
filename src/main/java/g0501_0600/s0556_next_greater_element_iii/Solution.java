package g0501_0600.s0556_next_greater_element_iii;

// #Medium #String #Math #Two_Pointers #Programming_Skills_II_Day_10
// #2022_08_03_Time_0_ms_(100.00%)_Space_39.2_MB_(89.26%)

public class Solution {

    /*
    - What this problem wants is finding the next permutation of n
    - Steps to find the next permuation:
       find largest index k such that inp[k] < inp[k+1];
           if k == -1: return -1
           else:
               look for largest index l such that inp[l] > inp[k]
               swap the two index
               reverse from k+1 to n.length
       */
    public int nextGreaterElement(int n) {
        return 0;
    }

    private void swap(char[] inp, int i, int j) {}

    private void reverse(char[] inp, int start, int end) {}
}
