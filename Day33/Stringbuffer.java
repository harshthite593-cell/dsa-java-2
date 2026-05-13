import java.util.Random;

public class Stringbuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();  // Correct class
        StringBuffer sb1 = new StringBuffer("harsh thite");  // Correct class
        StringBuffer sb2 = new StringBuffer();  // Correct class

        sb.append("weMakeDevs");
        sb.replace(1, 2,"harsh");
        System.out.println(sb.delete(1,5));
        int size = 20;
        StringBuffer sb3 = new StringBuffer();  // Correct class
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int ascii = rand.nextInt(26) + 97; // a-z
            char ch = (char) ascii;
            sb3.append(ch);
        }
        System.out.println(sb3);



        String str = sb.toString();  // fixed variable
        System.out.println(str);
    }
}