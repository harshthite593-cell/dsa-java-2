public class problem125 {
    static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replace(",", "").replace(" ", "").replace(":","").toLowerCase();
        System.out.println(s);
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
        if(s.equals(reversed)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
