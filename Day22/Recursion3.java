public class Recursion3 {
    static void main(String[] args) {
        subseq("" , "abc");
    }
    static void subseq(String s , String up){
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        subseq(s+ch, up.substring(1));
        subseq(s,up.substring(1));
    }
}
