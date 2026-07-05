public class problme171 {
    static void main(String[] args) {
        String columnTitle = "ZY";
        char[] arr = columnTitle.toCharArray();
        if (arr.length == 2){
         int first =   ((int)arr[0]-64)*((int)arr[0]-64)+ ((int)arr[1]-64);
            System.out.println(first);
        }
        if (arr.length == 1) {
            System.out.println((int)arr[0]-64);
        }
    }
}
