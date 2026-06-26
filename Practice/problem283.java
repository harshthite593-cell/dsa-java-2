import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem283 {
    static void main(String[] args) {
        int[] nums ={0,1,0,3,12};
        int pos = 0;
        for( int num : nums){
            if(num != 0){
                nums[pos]=num;
            }
        }
        while (pos <nums.length){
            nums[pos] =0;
            pos++;
        }
        }
    }

