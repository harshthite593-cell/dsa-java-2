import java.util.Arrays;
import java.util.Stack;

public class problem2390 {
    static void main(String[] args) {

                String str = "leet**cod*e";
                char[] words = String.valueOf(str).toCharArray();
                int count =0;
        for (int i = 0; i < words.length; i++) {
            if(words[i] == '*'){
                count--;
        }else {
            words[count]=words[i];
            count++;
        }
        }
        str = String.valueOf(Arrays.copyOfRange(words, 0, count));
        System.out.println(str);
    }
}
