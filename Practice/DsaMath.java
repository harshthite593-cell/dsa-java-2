public class DsaMath {
    static void main(String[] args) {
        int n = 6 ;
        int last  = 0 ;
        int base = 5 ;
        int ans = 0;
        while(n > 0){
            last = n & 1;
            n  = n>>1;
            ans += base*last;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
