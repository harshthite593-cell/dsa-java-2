public class isprime {
    static void main(String[] args) {
boolean ans = isprime();
        System.out.println(ans);
    }
    static boolean isprime(){
        int n = 19;
        int c = 2;
        while(c * c <= n){
            if(n % c==0){
                return true;
            }
            c++;
        }return false;
    }
}
