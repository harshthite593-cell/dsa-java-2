import java.util.Arrays;

public class problem217 {
    static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
         Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                System.out.println("false");
            }
        }
        System.out.println("true");

    }
}
