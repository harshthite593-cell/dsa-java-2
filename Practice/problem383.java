import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class problem383 {
    static void main(String[] args) {
        String ransomNote = "b", magazine = "a";

        if(ransomNote.length() > magazine.length()){
            System.out.println("error unequal length");
        }
        HashMap<Character,Integer> counts = new HashMap<Character,Integer>();
        for (char c : magazine.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Step 2: Iterate through ransomNote and "consume" the characters
        boolean possible = true;
        for (char c : ransomNote.toCharArray()) {
            // If the character isn't there or we ran out (count is 0)
            if (!counts.containsKey(c) || counts.get(c) == 0) {
                possible = false;
                break;
            }
            // Reduce the count by 1
            counts.put(c, counts.get(c) - 1);
        } if (possible) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
