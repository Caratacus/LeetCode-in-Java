package g2201_2300.s2232_minimize_result_by_adding_parentheses_to_expression;

// #Medium #String #Enumeration #2022_06_12_Time_1_ms_(99.60%)_Space_40.1_MB_(100.00%)

public class Solution {

    // Variables for final solution, to avoid create combination Strings
    private int currentLeft = 0;
    private int currentRight = 0;
    private int currentMin = Integer.MAX_VALUE;

    public String minimizeResult(String expression) {
        return null;
    }

    // With this function, we calculate all possible combinations of parentheses from two pointers,
    // left and right.
    private void expand(int left, int right, String expression) {}

    /* This function is responsible for calculating the expressions of each variable.

    a = (0, left) // from the start of the expression to the first parentheses
    b = (left, right) // between parentheses, include plus sign
    c = (right, end of expression) // from the last parentheses to the end
    */
    private int evaluate(int left, int right, String expression) {
        return 0;
    }
}
