import java.util.Arrays;

public class problem28 {
    static void main(String[] args) {
        String  haystack = "sadbutsad", needle = "sad";
        char[] arr1 = needle.toCharArray();
        char[] arr2 = haystack.toCharArray();
        int count=0;
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                System.out.println(i);
            }
        }
    }
}
