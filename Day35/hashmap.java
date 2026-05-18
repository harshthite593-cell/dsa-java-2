import java.util.HashMap;
import java.util.HashSet;

public class hashmap {
    static void main(String[] args) {
//        String harsh = "harsh";
//        Integer a = 334343;
//        int ans = a.hashCode();
//
//        System.out.println(ans);
//        System.out.println(harsh.hashCode());
        HashMap<String , Integer> map = new HashMap<>();
        map.put("harsh", 10);
        map.put("karsh", 20);
        System.out.println(map.get("karsh"));
        System.out.println(map.getOrDefault("none",8));
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        System.out.println(set);

    }
}
