import java.util.Arrays;

public class problem13 {
    static void main(String[] args) {
        String s = "MCMXCIV";
        int count = 0;
        char[] arr1 = s.toCharArray();
        int prev =0 ;
        int no =0;

        System.out.println(Arrays.toString(arr1));
        for(int j=0;j<arr1.length;j++){
            switch (arr1[j]) {
                case 'I': no = 1; break;
                case 'V': no = 5; break;
                case 'X': no = 10; break;
                case 'L': no = 50; break;
                case 'C': no = 100; break;
                case 'D': no = 500; break;
                case 'M': no = 1000; break;
            }
            if(no > prev){
                count += no - 2 * prev;
                prev = no;
                continue;
            }


            switch (arr1[j]) {
                case 'I': count+=1; prev=1; break;
                case 'V': count+=5; prev=5; break;
                case 'X': count+=10; prev=10; break;
                case 'L': count+=50; prev=50; break;
                case 'C': count+=100; prev=100; break;
                case 'D': count+=500; prev=500; break;
                case 'M': count+=1000; prev=1000; break;
            }
        }
        System.out.println(count);
    }
}
