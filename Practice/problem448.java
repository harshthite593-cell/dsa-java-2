//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        Set<Integer> seen = new HashSet<>();
//        List<Integer> result = new ArrayList<>();
//
//        // Step 1: Store all numbers that exist in the array
//        for (int num : nums) {
//            seen.add(num);
//        }
//
//        // Step 2: Check 1 to n, add missing ones to result
//        for (int i = 1; i <= nums.length; i++) {
//            if (!seen.contains(i)) {
//                result.add(i);
//            }
//        }
//
//        return result;
//    }
//}