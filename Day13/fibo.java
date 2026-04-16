public class fibo {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibo(n));  // print result
    }

    static int fibo(int n){
        if (n < 4) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}