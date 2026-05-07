class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0; // unmatched '('
        int add = 0;  // insertions needed

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else { // ')'
                if (open > 0) {
                    open--;   // match with previous '('
                } else {
                    add++;    // need one '('
                }
            }
        }

        return add + open; // unmatched '(' need ')'
    }
}