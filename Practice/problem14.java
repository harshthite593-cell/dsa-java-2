public class problem14 {
    static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        int count=strs.length;
        int no =0;
        for (int i = 0; i < strs.length-1; i++) {
           String[] split = strs[i].split("");
            for (int j = 0; j < count; j++) {
                if (split[j].equals(strs[j])) {
                    no++;
                }
            }count = no;
            if(count == 0){
                System.out.println(no);
            }
        }
        System.out.println(count);
    }
}