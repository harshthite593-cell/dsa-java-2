public class patterns {
    public static void main(String[] args) {

        int n = 5;

        // Upper part
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}