import java.lang.reflect.Array;
import java.util.Arrays;

public class problem2 {
//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.
//    Example 2:
//
//    Input: l1 = [0], l2 = [0]
//    Output: [0]
//    Example 3:
//
//    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//    Output: [8,9,9,9,0,0,0,1]
static void main(String[] args) {
    int[] l1 = {9,9,9,9,9,9,9};
    int[] l2 = {9,9,9,9};
    int i;
    int a;
    if (l1.length >= l2.length) {
        for ( i = 0; i < l1.length; i++) {
            if(i<l2.length){
                a = l1[i] + l2[i];
            }else{
                a = l1[i];
            }
            if (a>=10){
                if(i>=l1.length) {
                    l1 = Arrays.copyOf(l1, l1.length + 1);
                }
                l1[i+1]+=a/10;
                l1[i]=a%10;
            }else {
                l1[i] = a;
            }
        }
        System.out.println(Arrays.toString(l1));

    } else{
            for ( i = 0; i < l2.length; i++) {
                 a = l1[i] + l2[i];
                if(i<l2.length){
                    a = l1[i] + l2[i];
                }else{
                    a = l1[i];
                }
                if (a>=10){
                    if(i>=l2.length) {
                        l2 = Arrays.copyOf(l2, l2.length + 1);
                    }
                    l2[i+1]+=a/10;
                    l2[i]=a%10;

                }else {
                    l2[i] = a;
                }
            }
            }
            System.out.println(Arrays.toString(l2));
    }
}

