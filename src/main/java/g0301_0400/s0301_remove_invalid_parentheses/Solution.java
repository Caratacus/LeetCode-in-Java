package g0301_0400.s0301_remove_invalid_parentheses;

// #Hard #String #Breadth_First_Search #Backtracking
// #2022_07_07_Time_3_ms_(91.59%)_Space_42.9_MB_(72.56%)

import java.util.List;

public class Solution {

    public List<String> removeInvalidParentheses(String s) {
        return null;
    }

    // BASIC IDEA: find prefix w/ extra ")".
    // THEN use for loop to delete ")"s inside prefix, making recursive calls on the ENTIRE STRING
    // b/c you don't know where the next ")" will be deleted.
    private void dfs(String s, int deletionSearch, int stackSearch, List<String> res, boolean ri) {}

    // reverses and inverts to accomplish r->l scan
    private String reverseInvert(String s) {
        return null;
    }
}
