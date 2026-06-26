import java.util.Arrays;

public class problem268 {
    static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length;i++){
            if(nums[i] == i+1){
                System.out.println(i);
            }
        }
    }
}
