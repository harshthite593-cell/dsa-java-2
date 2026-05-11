//class Solution {
//    public int minAddToMakeValid(String s) {
//
//        String word;
//        word = s;
//        int square = 0;
//        int curly = 0;
//        int circle =0;
//        int sum = 0;
//        for ( int i  = 0 ; i < word.length() ; i++){
//            if (word.charAt(i) == '{'){
//                curly++;
//            }
//            if ( word.charAt(i) == '[') {
//                square++;
//            }
//            if ( word.charAt(i) == '('){
//                circle++;
//            }
//            if ( word.charAt(i) == '}'){
//                curly--;
//            }
//            if ( word.charAt(i) == ']'){
//                square--;
//            }
//            if ( word.charAt(i) == ')'){
//                circle--;
//            }
//            }
//        return Math.abs(circle) + Math.abs(curly) + Math.abs(square);
//        }
//
