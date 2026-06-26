import java.util.ArrayList;
import java.util.Arrays;

public class problem26 {
    static void main(String[] args) {
      int[] nums= {0,0,1,1,1,2,2,4,6,6};

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[k + 1] = nums[i];
                k += 1;
            }
        }
    }
}
