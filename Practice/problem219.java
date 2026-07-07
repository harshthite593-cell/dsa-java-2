import java.util.HashMap;
import java.util.Scanner;

public class problem219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
            int index = map.get(nums[i]);
                if(index - i <= k){
                System.out.println("element found");
                   }
            }
            map.put(nums[i],i);
        }
        System.out.println("element not found");

        }

    }

