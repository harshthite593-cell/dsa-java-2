public class recursionBinarys {
    static void main(String[] args) {
        int[] arr ={2,4,5,6,8,9,10};
       int ans =search(0 , arr.length - 1,arr , 9);
        System.out.println(ans);
    }
    static int search(int s , int e, int[] arr, int target) {
        int m = s + (e - s) / 2;
        if (s > e) {
            return -1;

        }
        if (arr[m] == target) {
            return m;

        }
        if (arr[m] < target) {
            return search(s = m + 1, e, arr, target);
        }

        if (arr[m] > target) {
            return search(0, m - 1, arr, target);
        }return -1;
    }
}
