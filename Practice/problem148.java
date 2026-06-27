import java.util.Arrays;

public class problem148 {
    static void main(String[] args) {
        int[]  nums ={3,1,2,10,1};
        int prev;
        if (nums.length == 0){
            System.out.println("lenght is one");
        }
        int sum =0;
        for (int i = 0; i < nums.length ; i++) {
            prev = nums[i];
            nums[i]+=sum;
            sum+=prev;
        }
        System.out.println(Arrays.toString(nums));
    }
}
