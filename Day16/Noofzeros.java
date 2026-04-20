import java.lang.reflect.Array;
import java.util.ArrayList;

public class Noofzeros {
    static void main(String[] args) {
        int[] no = {1,2,9,4,5,6};
        boolean ans = count(no,1);
        System.out.println(ans);
    }
    static boolean count(int[] n, int i){
        if (i >= n.length) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (n[i-1]>n[i]){
            return false;
        }
        return count(n,++i);
    };
}
