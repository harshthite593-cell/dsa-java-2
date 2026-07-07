import java.util.HashMap;

public class problem1512 {
    static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count += map.get(nums[i]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(count);
    }
}
