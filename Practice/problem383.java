import java.util.HashSet;
import java.util.Set;

public class problem383 {
    static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        int count =0;
        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        char [] arr = ransomNote.toCharArray();
        char [] arr2 = magazine.toCharArray();
        if(arr.length > arr2.length) {
            System.out.println("less in length");
        }
       for(int i=0;i<arr2.length;i++) {
     if(i<arr.length) set.add(arr[i]);
       set2.add(arr2[i]);
       }
       for(int i=0;i<arr.length;i++) {
           if(set2.contains(arr[i])) {
               set2.remove(arr[i]);
               count++;
           }
       }if (count == arr.length){
            System.out.println("equal");
        }
    }
}
