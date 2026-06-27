//import static java.lang.Math.min;
//
//public class problem11 {
//    static void main(String[] args) {
//        int[] height= {1,8,6,2,5,4,8,3,7};
//        if(height.length == 2){
//            return height[0]>height[1]?height[1]:height[0];
//        }
//        int right = height.length-1;
//        int left=0;
//        int max=0;
//        while (left < right) {
//            if(height[right]<height[left]){
//                max = (right - left)*height[right]>max?(right - left)*height[right]:max;
//
//                right--;
//            }else{
//                max = (right - left)*height[left]>max?(right - left)*height[left]:max;
//                left++;
//            }
//
//        }
//        System.out.println(max);
//    }
//}
