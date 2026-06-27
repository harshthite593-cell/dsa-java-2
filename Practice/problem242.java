import java.util.Arrays;

public class problem242 {
    static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String[] s1 = s.split("");
        String[] s2 = t.split("");
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));

    }
}
