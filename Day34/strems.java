import java.io.IOException;
import java.io.InputStreamReader;

public class strems {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter a letter:");

            int letters = isr.read();  // reads one character
            System.out.println("You entered: " + (char)letters);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}