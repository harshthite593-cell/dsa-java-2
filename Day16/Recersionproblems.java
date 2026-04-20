public class Recersionproblems {
    static void main(String[] args) {
        int n = 1234;
        int ans = factorial(n,0);
        System.out.println(ans);
    }
    static int factorial(int n,int mult){
      if(n==0){
          return mult;
      }
      return factorial(n/10,mult + n%10);
    };
}
