public class RecersionBinary {
    static void main(String[] args) {
        int[]  arr = {1,2,3,4,7,8,9};
        int ans = find(arr , 0,2,0,arr.length-1);
        System.out.println(ans);
    }
    static int find(int[] arr, int i,int target,int start ,int end){
        int mid = start +(end - start)/2;

        if (i >= arr.length){
            return -1;
        }
      else  if(arr[i]==target){
            return i;
        }
       else if(arr[i] > target){
            return find(arr, i + 1,target,mid + 1,end);
        }
        else if(arr[i] < target){
            return find(arr, i + 1,target,start,mid - 1);
        }return -1;
    }
}
