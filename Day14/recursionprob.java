public class recursionprob {
    public static void main(String[] args) {
        int ans = fact(4, 1);
        System.out.println(ans);
    }

    static int fact(int n, int ans){
        if (n == 1) {
            return ans;
        }
        return fact(n - 1, ans * n); // FIXED
    }
}