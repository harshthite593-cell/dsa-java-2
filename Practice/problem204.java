public class problem204 {
    static void main(String[] args) {
        int n = 10;
        int count =0;
        while(n>1) {
            count = isPrime(n) ? count + 1 : count;            n--;
        };
        System.out.println(count);

    }
    public static boolean isPrime(int n){
            for (int i = 2; i*i <= n; i++) {  // i * i <= n means i <= √n
                if (n % i == 0) return false;
        }return true;
    }
}
