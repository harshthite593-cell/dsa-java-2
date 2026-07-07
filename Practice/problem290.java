//import java.util.Arrays;
//import java.util.HashMap;
//
//public class problem290 {
//    static void main(String[] args) {
//       String  pattern = "abba", s = "dog dog dog dog";
//       HashMap<Character, String> map = new HashMap<Character, String>();
//       char[] arr = pattern.toCharArray();
//        String[] split = s.split(" ");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(split));
//        for (int i = 0; i < split.length; i++) {
//            if(map.containsKey(arr[i])){
//
//            }else{
//                map.put(arr[i], split[i].trim());
//            }
//        }
//        for (int j = 0; j < split.length; j++) {
//            if (!split[j].trim().equals(map.get(arr[j]))){
//                if (map.containsKey(arr[j]) && map.get(arr[j]).equals(split[j])) {
//                }
//                System.out.println(map.get(arr[j]));
//            }
//        }
//
//    }
//}
