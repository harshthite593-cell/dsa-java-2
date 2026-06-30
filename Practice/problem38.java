import java.lang.reflect.Array;
import java.util.ArrayList;

public class problem38 {
    static void main(String[] args) {
        String num = "1";
        int n = 4;
        for (int j = 1; j < n; j++) {
            StringBuilder next = new StringBuilder();
            int count = 0;
            char prev = num.charAt(0);

            for (int i = 0; i < num.length(); i++) {
                char digit = num.charAt(i);
                if (digit == prev) {
                    count++;
                } else {
                    next.append(count);
                    next.append(prev);
                    prev = digit;
                    count = 1;
                }
            }
            // Don't forget the last group!
            next.append(count);
            next.append(prev);

            num = next.toString();
        }

        System.out.println(num);
    }
}
