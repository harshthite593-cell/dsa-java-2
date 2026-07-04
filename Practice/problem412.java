import java.util.ArrayList;
import java.util.List;

public class problem412 {
    static void main(String[] args) {
        int n = 15;
        List<String> list = new ArrayList<String>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 & i % 5 == 0) {list.add("FizzBuzz");continue;}
            if(i%3==0){list.add("Fizz");}
            if(i%5==0){list.add("Bizz");}
            else {list.addLast(String.valueOf(i));}
        }
        System.out.println(list);
    }
}
