import java.util.Arrays;

public class Mergesort {
    static void main(String[] args) {
        int[] arr = {1,4,5,6,3,8,9};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid+1,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left , int[] right){
        int i = 0;
        int j= 0;
        int k =0;
        int[] ans = new int[left.length+right.length];
        while(i < left.length && j < right.length){
            if(left[i]<=right[j]){
                ans[k]= right[j];
                j++;
                k++;
            }
            else{
                ans[k] = left[i];
                i++;
                k++;
            }
        }
        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        };
        while(j<right.length){
            ans[k] = left[j];
            j++;
            k++;
        }
        return ans;

    }
}
