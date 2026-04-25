import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,2,9};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int p = arr[m];

        while (s <= e) {
            while (arr[s] < p) {
                s++;
            }
            while (arr[e] > p) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr, low, e);
        sort(arr, s, hi);
    }
}