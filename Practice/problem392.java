import java.util.Arrays;

public class problem392 {
    static void main(String[] args) {
            String  s = "axc", t = "ahbgdc";
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            int count=0;
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] == arr1[count]) {
                count++;
                if(count == arr1.length){
                    System.out.println("done early");
                }
            }
        }if (count == arr1.length){
            System.out.println("done at last");
        }else{
            System.out.println("not done");
        }
    }
}
