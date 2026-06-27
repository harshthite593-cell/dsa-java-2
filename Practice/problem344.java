import java.util.Arrays;

public class problem344 {
    static void main(String[] args) {
        String[]  s = {"H","a","n","n","a","h"};
        String temp;
        int last = s.length-1;
        int mid = s.length/2;
        for (int i = 0; i < mid; i++) {
            temp = s[last-i];
            s[last-i] = s[i];
            s[i]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
