public class Recersion2 {
    static void main(String[] args) {
        String s = "harsha";
        String n ="";
        split(n,s);
    }
    static void split(String s , String up){
        if(up.length()==0){
            System.out.println(s);
            return;
        }
        char ch =up.charAt(0);
        if(ch == 'a'){
            split(s,up.substring(1));

        }else{
            split(s+ch,up.substring(1));
        }
    }
}
