//public class Solution {  // Must be public if file is named Solution.java
//    public String capitalizeTitle(String title) {
//        char[] chars = title.toLowerCase().toCharArray();
//        int n = chars.length;
//        int wordStart = 0;
//
//        for (int i = 0; i <= n; i++) {
//            if (i == n || chars[i] == ' ') {
//                int wordLength = i - wordStart;
//                if (wordLength > 2) {
//                    chars[wordStart] = Character.toUpperCase(chars[wordStart]);
//                }
//                wordStart = i + 1;
//            }
//        }
//        return new String(chars);
//    }
//
//    public static void main(String[] args) {  // Add this for local testing
//        Solution sol = new Solution();
//        System.out.println(sol.capitalizeTitle("capiTalIze tHe titLe"));
//        // Output: "Capitalize The Title"
//    }
//}