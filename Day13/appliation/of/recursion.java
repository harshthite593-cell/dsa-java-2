package appliation.of;

public class recursion {
    static void main(String[] args) {
        int a = 0;
        int b = 1;
        int mth = 300;
        print(mth , a, b);
    }

        static void print( int mth , int a , int b) {
           int c = a + b;
            if (c >= mth) {
                System.out.println(c);
                return;
            }

            System.out.println(c);
            a = b;
            b = c;
            print(mth , a , b );

    }
}
