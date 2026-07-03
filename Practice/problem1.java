import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class problem1 {
    static void main(String[] args) {
      int[]  nums = {2,7,11,15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (map.containsKey(req)) {
                System.out.println(map.get(req));
                System.out.println(i);

            }else  {
                map.put(nums[i], i);
            }
        }



    }
}
