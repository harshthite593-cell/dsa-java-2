public class problme171 {
    static void main(String[] args) {
        String columnTitle = "ZY";
        char[] arr = columnTitle.toCharArray();

        if (arr.length == 1) {
            System.out.println((int)arr[0]-64);
        }
        int no =0;
        for (int i = 1; i < arr.length; i++) {
             no += 26*i+(int)arr[i]-64;
        }
        System.out.println(no);
    }
}
