import java.util.Arrays;

public class problem1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] copy = new int[nums.length]; // Fixed: Create new array
        int mid = nums.length / 2;
        int j = 0;

        for (int i = 0; i < mid; i++) {
            copy[j] = nums[i];
            copy[j + 1] = nums[i + mid];
            j += 2;
        }

        System.out.println(Arrays.toString(copy)); // Should print: [2, 3, 5, 4, 1, 7]
    }
}