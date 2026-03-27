package g0701_0800.s0736_parse_lisp_expression;

// #Hard #String #Hash_Table #Stack #Recursion #2022_03_25_Time_4_ms_(95.58%)_Space_42_MB_(93.81%)

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class Solution {

    static class Exp {
        Deque<Exp> exps;
        String op;
        Exp parent;

        public Exp(Exp from) {
            this.exps = new LinkedList<>();
            this.parent = from;
        }

        private int evaluate(Map<String, Integer> vars) {
            return 0;
        }
    }

    private Exp buildTree(String exp) {
        return null;
    }

    public int evaluate(String exp) {
        return 0;
    }
}
