import java.util.Stack;

public class problem345 {
    static void main(String[] args) {
        String s = "IceCreAm";
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (isVowel(c)) stack.push(c);
        }
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])){
                chars[i]=stack.pop();
            };
        }
        System.out.println(chars);

    }
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
