import java.util.Arrays;

public class problem7 {
    static void main(String[] args) {
        int x = 123;
        int n =0;
        while (x > 0) {
            int no = x%10;
            x /= 10;
            n = n * 10 + no;
        }
        if (x < 0){
            n = n *-1;
        }
        System.out.println(n);
    }
}
