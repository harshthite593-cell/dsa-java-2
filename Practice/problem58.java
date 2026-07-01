public class problem58 {
    static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String[] arr1 = s.split(" ");
        int len = arr1[arr1.length-1].length();
        System.out.println(len);
    }
}
