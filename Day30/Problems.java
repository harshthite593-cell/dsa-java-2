import java.util.Stack;

public class Problems {
    public static void main(String[] args) {
        String word = "{}[]";
        System.out.println(stack(word));
    }

    public static int stack(String s) {
        String word;
        word = s;
        int add = 0;
        Stack<Character> stackk = new Stack<>();
        for ( int i  = 0 ; i < word.length() ; i++){
            
            if (word.charAt(i) == '{' || word.charAt(i) == '[' || word.charAt(i) == '('){
                stackk.push(word.charAt(i));
            }
            else{
            if (stackk.isEmpty()) {
                    return add;
                }
            if (word.charAt(i) == '}' && stackk.peek() != '{' || word.charAt(i) == ']'&& stackk.peek() != '[' || word.charAt(i) == ')'&& stackk.peek() != '('){
                stackk.pop();
                }
            else{
                ++add;
            }
            }
        }
        return add;
    }

    }
