public class sumdigits {
    static void main(String[] args) {
        int no = 1234;
        int sum = 0;
     int ans =   sum(no,sum);
        System.out.println(ans);
    }
    static int sum(int n , int sum){
        if (n == 0) {
            return sum;
        };
        return sum(n / 10, sum*10+n%10);
    }
}
