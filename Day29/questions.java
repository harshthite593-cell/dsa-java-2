public class questions {
    static void main(String[] args) {
     int[] heights = {2,4};
     int ans = largestRectangleArea(heights);
        System.out.println(ans);
    }
    static int largestRectangleArea(int[] heights) {
        int max = 0;
        int mult = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[i - 1]) {
                mult = heights[i-1] + heights[i-1];
                if (mult > max) {
                    max = mult;
                }
            } else if (heights[i] < heights[i - 1]) {
                mult = heights[i] + heights[i];
                if (mult > max) {
                    max = mult;
                }
            }
        }
        return max;
    }}
