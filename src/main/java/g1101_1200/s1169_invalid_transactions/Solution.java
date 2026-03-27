package g1101_1200.s1169_invalid_transactions;

// #Medium #Array #String #Hash_Table #Sorting #2023_06_02_Time_9_ms_(98.31%)_Space_44.9_MB_(7.40%)

import java.util.List;
import java.util.Map;

public class Solution {

    private static class Transaction {
        String name;
        int time;
        int amount;
        String city;

        Transaction(String trans) {
            String[] s = trans.split(",");
            name = s[0];
            time = Integer.parseInt(s[1]);
            amount = Integer.parseInt(s[2]);
            city = s[3];
        }
    }

    public List<String> invalidTransactions(String[] input) {
        return null;
    }

    private boolean isValid(Transaction transaction, Map<String, List<Transaction>> map) {
        return false;
    }
}
