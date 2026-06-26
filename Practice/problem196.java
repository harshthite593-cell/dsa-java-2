import java.lang.reflect.Array;
import java.util.Arrays;

public class problem196 {
    static void main(String[] args) {
        int[]  nums = {3,3,4};
        Arrays.sort(nums);
        int max =0;
        int count =0;
        int target=nums[0];
        if(nums.length == 1){
            System.out.println("one length array");
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                count++;
                if(count > max){
                    target = nums[i];

                    max = count;
                }
            }else {
                count = 0;
            }
            if(target==nums[nums.length-1]){
                max+=1;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(target);
    }
}
