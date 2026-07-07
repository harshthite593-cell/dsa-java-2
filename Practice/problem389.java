import java.util.HashMap;

public class problem389 {
    static void main(String[] args) {
        String s = "abcd", t = "abcde";
        boolean stat = true;
        HashMap<Character,Integer> counts = new HashMap<Character,Integer>();
        if(s.length() < t.length()){
        for (char c : s.toCharArray()) {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        for(char c : t.toCharArray()){
            if (!counts.containsKey(c) || counts.get(c) == 0) {
                // This is the extra character
            }
            // Consume one occurrence
            counts.put(c, counts.get(c) - 1);
        }
        }else {
            for (char c : t.toCharArray()) {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
            for(char c : s.toCharArray()){
                if (!counts.containsKey(c) || counts.get(c) == 0) {
                    // This is the extra character
                }
                // Consume one occurrence
                counts.put(c, counts.get(c) - 1);
            }
        }
    }
}
