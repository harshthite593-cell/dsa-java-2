public class practice {
    static void main(String[] args) {
        int[] n ={1,3,5,7,8};
         boolean ans = sorted(n,0);
        System.out.println(ans);
    }
    static boolean sorted(int[] n , int i){
        int j = i + 1;
        if (i == n.length - 1){
            return true;
        }
        if (n[j]<n[i]){
            return false;
        }
        return sorted(n,++i);
    }
}
