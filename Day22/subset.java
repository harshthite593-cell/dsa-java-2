import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        ArrayList<String> result = subseq("", "abc");
        System.out.println(result);
    }

    static ArrayList<String> subseq(String s, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq(s + ch, up.substring(1));
        ArrayList<String> right = subseq(s, up.substring(1));

        left.addAll(right);
        return left;
    }
}