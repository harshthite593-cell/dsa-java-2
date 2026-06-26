import java.util.Arrays;

public class problem136 {
    static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        Arrays.sort(nums);
        int ans = 0;
        int result;
        System.out.println(Arrays.toString(nums));
        if(nums.length == 1){
            System.out.println("one length array");
        }
        else{
            for (int i = 0; i < nums.length-1; i+=2) {
                if (nums[i] != nums[i+1]) {
                    System.out.println(nums[i]);
                }
            } result = (ans != 0) ? ans : nums[nums.length - 1];
            System.out.println(result);

        }
    }
}
