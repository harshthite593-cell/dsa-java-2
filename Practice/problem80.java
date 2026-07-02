import java.util.Arrays;

public class problem80 {
    static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int prev =nums[0];
        int count =1;
        int index =1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==prev ){
                if (count>=2){continue;}
                count++;
                nums[index++]=nums[i];

            }else {
                prev=nums[i];
                count=1;
                nums[index++]=nums[i];
            }
        }
        System.out.println(index);
        System.out.println(Arrays.toString(nums));
    }
}
