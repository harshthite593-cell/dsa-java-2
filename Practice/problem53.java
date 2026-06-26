import java.util.Arrays;

public class problem53 {
    static void main(String[] args) {
        int[] nums ={12,4,6,7,8,0,7,0,5,0};
        int currentsum =0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
           currentsum  = currentsum + nums[i] > nums[i] ? currentsum + nums[i] : nums[i];
           max=Math.max(max,currentsum);
        }
        System.out.println(nums);
        Arrays.stream(nums).filter(num->num>0);



    }
}
