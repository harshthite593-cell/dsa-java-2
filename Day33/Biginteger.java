import java.math.BigInteger;

public class Biginteger {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = new BigInteger("999999999999999999999");

        // Addition
        BigInteger sum = a.add(b);

        // Subtraction
        BigInteger diff = b.subtract(a);

        // Multiplication
        BigInteger prod = a.multiply(b);

        // Division
        BigInteger div = b.divide(a);

        // Modulus
        BigInteger mod = b.mod(a);

        // Printing
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
    }
}